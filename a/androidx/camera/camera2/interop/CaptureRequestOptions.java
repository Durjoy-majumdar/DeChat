package androidx.camera.camera2.interop;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.impl.C16539j;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.ReadableConfig;
import java.util.Set;
import p378r.b$$a;

public class CaptureRequestOptions implements ReadableConfig {
    private final Config mConfig;

    public static final class Builder implements ExtendableBuilder<CaptureRequestOptions> {
        private final MutableOptionsBundle mMutableOptionsBundle = MutableOptionsBundle.create();

        public static Builder from(Config config) {
            Builder builder = new Builder();
            config.findOptions(Camera2ImplConfig.CAPTURE_REQUEST_ID_STEM, new b$$a(builder, config));
            return builder;
        }

        public <ValueT> Builder clearCaptureRequestOption(CaptureRequest.Key<ValueT> key) {
            this.mMutableOptionsBundle.removeOption(Camera2ImplConfig.createCaptureRequestOption(key));
            return this;
        }

        public MutableConfig getMutableConfig() {
            return this.mMutableOptionsBundle;
        }

        public <ValueT> Builder setCaptureRequestOption(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.mMutableOptionsBundle.insertOption(Camera2ImplConfig.createCaptureRequestOption(key), valuet);
            return this;
        }

        public CaptureRequestOptions build() {
            return new CaptureRequestOptions(OptionsBundle.from(this.mMutableOptionsBundle));
        }
    }

    public CaptureRequestOptions(Config config) {
        this.mConfig = config;
    }

    public /* synthetic */ boolean containsOption(Config.Option option) {
        return C16539j.m15570a(this, option);
    }

    public /* synthetic */ void findOptions(String str, Config.OptionMatcher optionMatcher) {
        C16539j.m15571b(this, str, optionMatcher);
    }

    public <ValueT> ValueT getCaptureRequestOption(CaptureRequest.Key<ValueT> key) {
        return this.mConfig.retrieveOption(Camera2ImplConfig.createCaptureRequestOption(key), null);
    }

    public Config getConfig() {
        return this.mConfig;
    }

    public /* synthetic */ Config.OptionPriority getOptionPriority(Config.Option option) {
        return C16539j.m15572c(this, option);
    }

    public /* synthetic */ Set getPriorities(Config.Option option) {
        return C16539j.m15573d(this, option);
    }

    public /* synthetic */ Set listOptions() {
        return C16539j.m15574e(this);
    }

    public /* synthetic */ Object retrieveOption(Config.Option option) {
        return C16539j.m15575f(this, option);
    }

    public /* synthetic */ Object retrieveOption(Config.Option option, Object obj) {
        return C16539j.m15576g(this, option, obj);
    }

    public /* synthetic */ Object retrieveOptionWithPriority(Config.Option option, Config.OptionPriority optionPriority) {
        return C16539j.m15577h(this, option, optionPriority);
    }

    public <ValueT> ValueT getCaptureRequestOption(CaptureRequest.Key<ValueT> key, ValueT valuet) {
        return this.mConfig.retrieveOption(Camera2ImplConfig.createCaptureRequestOption(key), valuet);
    }
}
