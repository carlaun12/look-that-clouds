# Engineering instructions for AI coding agents

## Mission and scope

Build **Look That Clouds** as an independent Minecraft cloud mod. This is a new design, **not** a port or rewrite of source files from Simple Clouds or the archived neomine-clouds repository. Historical implementations may inform problem analysis, but never copy code/assets or assume their architecture is desired.

The current codebase is a client-only Fabric bootstrap. Do not add renderers, weather systems, APIs, configurations, compatibility shims, service registries, or architecture layers without a concrete feature request.

## Design principles (use judgment)

- **KISS:** Choose the least complex design that meets a verified requirement.
- **YAGNI:** Do not implement future flexibility, optional integrations, or unrequested features.
- **SOLID:** Keep responsibilities cohesive and dependencies explicit; don't introduce interfaces with only one implementation without a real boundary.
- **DRY:** Extract duplicated *knowledge or behavior*, not merely similar-looking lines.
- Prefer readable Java over cleverness, reflection, generic frameworks, and speculative abstractions.

## Task workflow

1. Inspect the current repository and `git status` before editing; preserve unrelated changes.
2. Define the observable requirement and acceptance criteria in a few sentences.
3. Inspect only relevant files and exact Fabric/Minecraft dependency contracts.
4. Make the smallest cohesive change; avoid unrelated formatting and refactoring.
5. Run `./gradlew build` at minimum for code/build changes; run `./gradlew runClient` for client behavior when feasible.
6. Rendering/shader/mixin correctness requires actual runtime evidence; never equate compilation or logs with correct visual output.
7. Review the diff for accidental complexity, dependency growth, hardcoded environment paths, and hidden failure handling.
8. Report what changed, what commands actually ran, their outcomes, and what remains unverified.

Never silence an integration failure by disabling behavior or using broad catch-and-ignore code. Do not invent tests or claim a runtime scenario was executed unless it was.

## Boundaries

- Keep the project client-only until server functionality is explicitly requested.
- Do not introduce direct OpenGL/Vulkan or renderer-specific dependencies until the rendering approach is chosen.
- Do not copy dependencies, mod IDs, packages, assets, or licensing from the archived project.
- Fabric versions are declared centrally in `gradle.properties`; update them deliberately, with compatibility verification.
- Record a substantial technical decision in `docs/DECISIONS.md` when it is actually made. Keep the document short.
- Do not select a license on the user's behalf.
- Do not commit, push, publish, or release without explicit user instruction.

## Definition of done

The requested behavior works under the relevant runtime conditions, applicable automated checks pass, and unresolved limitations are explicit. A green build without runtime verification is not proof of graphical correctness.
