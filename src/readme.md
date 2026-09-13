# Builder Pattern

This project demonstrates the **Builder Creational Design Pattern** in Java.

## Domain Overview
The system allows clients to build custom gaming laptops step-by-step using a temporary interface (`GamingLaptopBuilder`) or choose pre-configured laptop builds made by a director (`GamingLaptopDirector`).

## Project Structure
- `model.GamingLaptop`: The product class representing the target complex object.
- `builder.GamingLaptopBuilder`: The builder implementing a fluent API (method chaining) and state validation.
- `director.GamingLaptopDirector`: Orchestrates predefined configurations (e.g., eSports Pro, Budget Gamer).
- `Main`: Client entry point testing custom and director configurations.

---

## Clean Code Principles Applied

### 1. Validated Construction
- **Code:** `GamingLaptopBuilder.validateConfiguration()`
- **Justification:** The `build()` method executes validation before instantiating `GamingLaptop`. If required fields (e.g., processor, RAM) are missing or invalid, an `IllegalStateException` is thrown, preventing broken objects from existing in memory.

### 2. No Magic Numbers
- **Code:** `GamingLaptopDirector.ESPORTS_RAM_GB`, `GamingLaptopDirector.BUDGET_SSD_GB`
- **Justification:** Raw numeric literals (such as `32` or `1000`) are extracted into descriptive `private static final` constants in `GamingLaptopDirector` to prevent confusion and simplify maintenance.

### 3. Meaningful, Intention-Revealing Names
- **Code:** `ramSizeGB`, `storageCapacityGB`, `hasRGBKeyboard`
- **Justification:** Variable and method names explicitly convey their purpose and measurement units instead of using ambiguous abbreviations (e.g., `r` or `mem`).

### 4. Single Responsibility Principle (SRP)
- **Code:** Separation into `GamingLaptop`, `GamingLaptopBuilder`, and `GamingLaptopDirector`.
- **Justification:** `GamingLaptop` handles data storage, `GamingLaptopBuilder` manages step-by-step construction and validation, and `GamingLaptopDirector` encapsulates preset configuration recipes.

### 5. Small Methods Doing One Thing
- **Code:** `validateConfiguration()`
- **Justification:** Validation logic was extracted into its own private helper function rather than polluting `build()`, keeping both methods short, readable, and focused on a single responsibility.