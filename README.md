# saas-ia-2

This repository contains a simple Java Spring Boot backend and an Angular frontend.

## Prerequisites
- Java 21 and Gradle
- Node.js 20+ and npm
- Angular CLI (`npm install -g @angular/cli`) for local development

## Backend
The backend project lives in the `backend/` directory.

Run the application:
```bash
cd backend
./gradlew bootRun
```
The service starts on `http://localhost:8080` and exposes a sample API at `GET /api/data`.

## Frontend
The Angular project is in `frontend/`.

Install dependencies and start the dev server:
```bash
cd frontend
npm install
npm start
```
During development, API calls to `/api` are proxied to the backend thanks to `proxy.conf.json`.

## Integration
When both servers are running, open `http://localhost:4200` in your browser. The home page loads data from the Spring Boot backend and displays it in a list.
