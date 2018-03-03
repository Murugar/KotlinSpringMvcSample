package com.iqmsoft

interface TextProvider {
    val value: String
}

class StaticTextProvider(override val value: String) : TextProvider