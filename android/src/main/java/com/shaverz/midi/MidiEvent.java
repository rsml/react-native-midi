package com.shaverz.midi;

public enum MidiEvent {
    // Device Attach/Detach Events
    DEVICE_ATTACHED,
    DEVICE_DETACHED,
    INPUT_DEVICE_ATTACHED,
    INPUT_DEVICE_DETACHED,
    OUTPUT_DEVICE_ATTACHED,
    OUTPUT_DEVICE_DETACHED,

    // Midi Events
    MISC_FUNCTION_CODES,
    CABLE_EVENTS,
    SYSTEM_COMMON_MESSAGE,
    SYSTEM_EXCLUSIVE,
    NOTE_ON,
    NOTE_OFF,
    POLYPHONIC_AFTERTOUCH,
    CONTROL_CHANGE,
    PROGRAM_CHANGE,
    CHANNEL_AFTERTOUCH,
    PITCH_WHEEL,
    SINGLE_BYTE,
    TIME_CODE_QUARTER_FRAME,
    SONG_SELECT,
    SONG_POSITION_POINTER,
    TUNE_REQUEST,
    TIMING_CLOCK,
    START,
    CONTINUE,
    STOP,
    ACTIVE_SENSING,
    RESET
}