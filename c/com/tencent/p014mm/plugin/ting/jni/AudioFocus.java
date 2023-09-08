package com.tencent.p014mm.plugin.ting.jni;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u000b2\u00020\u0001:\u0003\f\r\u000bJ\u001c\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ting/jni/AudioFocus;", "", "", "type", "", "context", "Lrx3/b0;", "requestFocus", "Lcom/tencent/mm/plugin/ting/jni/TingAudioFocusCallbackCpp;", "callback", "setAudioFocusCallback", "Companion", "AudioFocusRequestResult", "AudioFocusType", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ting.jni.AudioFocus */
public interface AudioFocus {
    public static final int AUDIO_FOCUS_RESULT_FAIL = -1;
    public static final int AUDIO_FOCUS_RESULT_OK = 0;
    public static final int AUDIO_FOCUS_TYPE_RELEASE = 2;
    public static final int AUDIO_FOCUS_TYPE_REQUEST = 1;
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ting/jni/AudioFocus$AudioFocusRequestResult;", "", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.tencent.mm.plugin.ting.jni.AudioFocus$AudioFocusRequestResult */
    public @interface AudioFocusRequestResult {
    }

    @Metadata(mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ting/jni/AudioFocus$AudioFocusType;", "", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.tencent.mm.plugin.ting.jni.AudioFocus$AudioFocusType */
    public @interface AudioFocusType {
    }

    @Metadata(mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ting/jni/AudioFocus$Companion;", "", "()V", "AUDIO_FOCUS_RESULT_FAIL", "", "AUDIO_FOCUS_RESULT_OK", "AUDIO_FOCUS_TYPE_RELEASE", "AUDIO_FOCUS_TYPE_REQUEST", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.ting.jni.AudioFocus$Companion */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int AUDIO_FOCUS_RESULT_FAIL = -1;
        public static final int AUDIO_FOCUS_RESULT_OK = 0;
        public static final int AUDIO_FOCUS_TYPE_RELEASE = 2;
        public static final int AUDIO_FOCUS_TYPE_REQUEST = 1;

        private Companion() {
        }
    }

    void requestFocus(@AudioFocusType int i, byte[] bArr);

    void setAudioFocusCallback(TingAudioFocusCallbackCpp tingAudioFocusCallbackCpp);
}
