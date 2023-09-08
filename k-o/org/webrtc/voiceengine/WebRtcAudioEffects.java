package org.webrtc.voiceengine;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import java.util.List;
import java.util.UUID;
import org.webrtc.Logging;

public class WebRtcAudioEffects {
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioEffects";
    private static AudioEffect.Descriptor[] cachedEffects;
    private AcousticEchoCanceler aec;

    /* renamed from: ns */
    private NoiseSuppressor f61882ns;
    private boolean shouldEnableAec;
    private boolean shouldEnableNs;

    private WebRtcAudioEffects() {
        Logging.m25022d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
    }

    private static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static boolean canUseAcousticEchoCanceler() {
        boolean z = isAcousticEchoCancelerSupported() && !WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler() && !isAcousticEchoCancelerBlacklisted() && !isAcousticEchoCancelerExcludedByUUID();
        Logging.m25022d(TAG, "canUseAcousticEchoCanceler: " + z);
        return z;
    }

    public static boolean canUseNoiseSuppressor() {
        boolean z = isNoiseSuppressorSupported() && !WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor() && !isNoiseSuppressorBlacklisted() && !isNoiseSuppressorExcludedByUUID();
        Logging.m25022d(TAG, "canUseNoiseSuppressor: " + z);
        return z;
    }

    public static WebRtcAudioEffects create() {
        return new WebRtcAudioEffects();
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
        return (AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) || (AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported());
    }

    private static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
        cachedEffects = queryEffects;
        return queryEffects;
    }

    public static boolean isAcousticEchoCancelerBlacklisted() {
        List<String> blackListedModelsForAecUsage = WebRtcAudioUtils.getBlackListedModelsForAecUsage();
        String str = Build.MODEL;
        boolean contains = blackListedModelsForAecUsage.contains(str);
        if (contains) {
            Logging.m25026w(TAG, str + " is blacklisted for HW AEC usage!");
        }
        return contains;
    }

    private static boolean isAcousticEchoCancelerEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC);
    }

    private static boolean isAcousticEchoCancelerExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AEC) && descriptor.uuid.equals(AOSP_ACOUSTIC_ECHO_CANCELER)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isAcousticEchoCancelerEffectAvailable();
    }

    private static boolean isEffectTypeAvailable(UUID uuid) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorBlacklisted() {
        List<String> blackListedModelsForNsUsage = WebRtcAudioUtils.getBlackListedModelsForNsUsage();
        String str = Build.MODEL;
        boolean contains = blackListedModelsForNsUsage.contains(str);
        if (contains) {
            Logging.m25026w(TAG, str + " is blacklisted for HW NS usage!");
        }
        return contains;
    }

    private static boolean isNoiseSuppressorEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS);
    }

    private static boolean isNoiseSuppressorExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_NS) && descriptor.uuid.equals(AOSP_NOISE_SUPPRESSOR)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isNoiseSuppressorEffectAvailable();
    }

    public void enable(int i) {
        Logging.m25022d(TAG, "enable(audioSession=" + i + ")");
        boolean z = true;
        assertTrue(this.aec == null);
        assertTrue(this.f61882ns == null);
        String str = "enabled";
        if (isAcousticEchoCancelerSupported()) {
            AcousticEchoCanceler create = AcousticEchoCanceler.create(i);
            this.aec = create;
            if (create != null) {
                boolean enabled = create.getEnabled();
                boolean z2 = this.shouldEnableAec && canUseAcousticEchoCanceler();
                if (this.aec.setEnabled(z2) != 0) {
                    Logging.m25023e(TAG, "Failed to set the AcousticEchoCanceler state");
                }
                StringBuilder sb = new StringBuilder();
                sb.append("AcousticEchoCanceler: was ");
                sb.append(enabled ? str : "disabled");
                sb.append(", enable: ");
                sb.append(z2);
                sb.append(", is now: ");
                sb.append(this.aec.getEnabled() ? str : "disabled");
                Logging.m25022d(TAG, sb.toString());
            } else {
                Logging.m25023e(TAG, "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorSupported()) {
            NoiseSuppressor create2 = NoiseSuppressor.create(i);
            this.f61882ns = create2;
            if (create2 != null) {
                boolean enabled2 = create2.getEnabled();
                if (!this.shouldEnableNs || !canUseNoiseSuppressor()) {
                    z = false;
                }
                if (this.f61882ns.setEnabled(z) != 0) {
                    Logging.m25023e(TAG, "Failed to set the NoiseSuppressor state");
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("NoiseSuppressor: was ");
                sb4.append(enabled2 ? str : "disabled");
                sb4.append(", enable: ");
                sb4.append(z);
                sb4.append(", is now: ");
                if (!this.f61882ns.getEnabled()) {
                    str = "disabled";
                }
                sb4.append(str);
                Logging.m25022d(TAG, sb4.toString());
                return;
            }
            Logging.m25023e(TAG, "Failed to create the NoiseSuppressor instance");
        }
    }

    public void release() {
        Logging.m25022d(TAG, "release");
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        NoiseSuppressor noiseSuppressor = this.f61882ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.f61882ns = null;
        }
    }

    public boolean setAEC(boolean z) {
        Logging.m25022d(TAG, "setAEC(" + z + ")");
        if (!canUseAcousticEchoCanceler()) {
            Logging.m25026w(TAG, "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        } else if (this.aec == null || z == this.shouldEnableAec) {
            this.shouldEnableAec = z;
            return true;
        } else {
            Logging.m25023e(TAG, "Platform AEC state can't be modified while recording");
            return false;
        }
    }

    public boolean setNS(boolean z) {
        Logging.m25022d(TAG, "setNS(" + z + ")");
        if (!canUseNoiseSuppressor()) {
            Logging.m25026w(TAG, "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        } else if (this.f61882ns == null || z == this.shouldEnableNs) {
            this.shouldEnableNs = z;
            return true;
        } else {
            Logging.m25023e(TAG, "Platform NS state can't be modified while recording");
            return false;
        }
    }
}
