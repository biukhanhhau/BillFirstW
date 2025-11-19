# Giai đoạn 1: Build code
# Dùng Maven và Java 21 (Bản ổn định nhất hiện nay tương thích ngược với 25)
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Giai đoạn 2: Chạy ứng dụng
FROM eclipse-temurin:21-jdk
WORKDIR /app
# Copy file .jar đã build ở trên sang đây
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]