# Look That Clouds

An independent, experimental Minecraft cloud mod, starting from a clean codebase.

> **Status:** Project skeleton only. There is no cloud renderer, cloud simulation, or gameplay feature yet.

## Scope

The intention is to design a new cloud system rather than port Simple Clouds or reuse the archived neomine-clouds implementation. Rendering, simulation, weather, configuration, performance targets, and optional integrations are **not decided yet**.

## Current development baseline

- Minecraft: **26.3**
- Fabric Loader: **0.20.1**
- Fabric Loom: **1.19-SNAPSHOT**
- Java: **25**
- Gradle: **9.8.2** (wrapper)

The project is currently a **client-only mod**. Fabric API, Iris, Sodium, Voxy and other integrations are not dependencies until a real feature requires them.

## Build

Install JDK 25, then run:

```sh
./gradlew build
./gradlew runClient
```

On Windows, use `gradlew.bat`. The first invocation downloads the Gradle distribution and development dependencies.

## Engineering policy

- **KISS:** Favor the smallest understandable implementation.
- **YAGNI:** Do not implement speculative features, frameworks, or compatibility.
- **SOLID:** Apply cohesion, clear responsibilities, and dependency direction when justified by actual code.
- **DRY:** Eliminate duplicated knowledge; do not create abstractions for coincidentally similar code.

AI agents may write the implementation, but a successful compilation alone does not prove correct rendering or integration. See [AGENTS.md](AGENTS.md) for the contribution workflow and [docs/DECISIONS.md](docs/DECISIONS.md) for decisions that are deliberately open.

## Source and licensing

This repository starts with original scaffolding and a Fabric client entrypoint. Do not import code or assets from Simple Clouds or neomine-clouds as a shortcut.

**License not selected.** Public visibility does not grant redistribution or reuse rights. Choose a license before distributing releases or accepting external code contributions.
