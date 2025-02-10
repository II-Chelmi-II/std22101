package com.michel.app.file.hash;

import com.michel.app.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
