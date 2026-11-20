# Totem Only F Swap

Client-side Fabric mod (Minecraft 1.21.11). F offhand swap works only when the selected hotbar item is a Totem of Undying. Inventory screens and the offhand slot stay vanilla.

## Build preko GitHuba
1. Napravi novi repo na GitHubu i uploadaj SVE iz ovog foldera (ukljucujuci skriveni folder `.github`).
2. Otvori tab **Actions** -> `build` -> sacekaj zeleni check.
3. Skini jar iz **Artifacts** (`totem-only-f-swap`). Koristi jar bez `-sources`.
4. Stavi jar + Fabric API u `.minecraft/mods`.

Ako build pukne zbog verzije zavisnosti, azuriraj `loader_version` i `fabric_version` u `gradle.properties` prema https://fabricmc.net/develop
