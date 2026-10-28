# Decision record

Record actual decisions here, not speculative architecture. Prefer short dated entries describing the decision, rationale, and trade-off.

## 2026-10-27 — Bootstrap (provisional)

- Start a clean, independent client-side Fabric mod rather than porting Simple Clouds.
- Use Minecraft 26.3, Java 25, Fabric Loader 0.20.1, and the corresponding official example-mod toolchain as the initial *development baseline*.
- Keep only one client initialization class, no rendering code, no Fabric API dependency, no Mixins, and no configuration framework.
- Use the Gradle wrapper and a CI build as the minimum automated feedback loop.
- Leave the license undecided until explicitly chosen.

The chosen Minecraft/toolchain versions are implementation defaults, not requirements for the future renderer.

## Deliberately undecided

- Cloud representation and rendering technique (geometry, raymarching, hybrid, other).
- Cloud dynamics, volumetric lighting, and weather simulation.
- Art direction, performance targets, GPU/API compatibility, and memory budgets.
- Shader-pack integration (Iris), optimization mods (Sodium), LOD systems (Voxy), and multiplayer.
- Runtime configuration, public APIs, serialization, asset pipelines, and supported platforms.

Decide these from concrete requirements and measurements, not pre-emptive scaffolding.
