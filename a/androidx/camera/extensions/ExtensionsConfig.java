package androidx.camera.extensions;

import androidx.camera.core.impl.C16531b;
import androidx.camera.core.impl.C16539j;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.Identifier;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.Set;

class ExtensionsConfig implements CameraConfig {
    public static final Config.Option<Integer> OPTION_EXTENSION_MODE = Config.Option.create("camerax.extensions.extensionMode", Integer.TYPE);
    private final Config mConfig;

    public static final class Builder implements CameraConfig.Builder<Builder> {
        private final MutableOptionsBundle mConfig = MutableOptionsBundle.create();

        public ExtensionsConfig build() {
            return new ExtensionsConfig(this.mConfig);
        }

        public Builder setExtensionMode(int i) {
            this.mConfig.insertOption(ExtensionsConfig.OPTION_EXTENSION_MODE, Integer.valueOf(i));
            return this;
        }

        public Builder setCompatibilityId(Identifier identifier) {
            this.mConfig.insertOption(CameraConfig.OPTION_COMPATIBILITY_ID, identifier);
            return this;
        }

        public Builder setSessionProcessor(SessionProcessor sessionProcessor) {
            this.mConfig.insertOption(CameraConfig.OPTION_SESSION_PROCESSOR, sessionProcessor);
            return this;
        }

        public Builder setUseCaseCombinationRequiredRule(int i) {
            this.mConfig.insertOption(CameraConfig.OPTION_USE_CASE_COMBINATION_REQUIRED_RULE, Integer.valueOf(i));
            return this;
        }

        public Builder setUseCaseConfigFactory(UseCaseConfigFactory useCaseConfigFactory) {
            this.mConfig.insertOption(CameraConfig.OPTION_USECASE_CONFIG_FACTORY, useCaseConfigFactory);
            return this;
        }

        public Builder setZslDisabled(boolean z) {
            this.mConfig.insertOption(CameraConfig.OPTION_ZSL_DISABLED, Boolean.valueOf(z));
            return this;
        }
    }

    public ExtensionsConfig(Config config) {
        this.mConfig = config;
    }

    public /* synthetic */ boolean containsOption(Config.Option option) {
        return C16539j.m15570a(this, option);
    }

    public /* synthetic */ void findOptions(String str, Config.OptionMatcher optionMatcher) {
        C16539j.m15571b(this, str, optionMatcher);
    }

    public Identifier getCompatibilityId() {
        return (Identifier) retrieveOption(CameraConfig.OPTION_COMPATIBILITY_ID);
    }

    public Config getConfig() {
        return this.mConfig;
    }

    public int getExtensionMode() {
        return ((Integer) retrieveOption(OPTION_EXTENSION_MODE)).intValue();
    }

    public /* synthetic */ Config.OptionPriority getOptionPriority(Config.Option option) {
        return C16539j.m15572c(this, option);
    }

    public /* synthetic */ Set getPriorities(Config.Option option) {
        return C16539j.m15573d(this, option);
    }

    public /* synthetic */ SessionProcessor getSessionProcessor() {
        return C16531b.m15538a(this);
    }

    public /* synthetic */ SessionProcessor getSessionProcessor(SessionProcessor sessionProcessor) {
        return C16531b.m15539b(this, sessionProcessor);
    }

    public /* synthetic */ int getUseCaseCombinationRequiredRule() {
        return C16531b.m15540c(this);
    }

    public /* synthetic */ UseCaseConfigFactory getUseCaseConfigFactory() {
        return C16531b.m15541d(this);
    }

    public /* synthetic */ Boolean isZslDisabled() {
        return C16531b.m15542e(this);
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
}
