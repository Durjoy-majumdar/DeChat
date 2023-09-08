package androidx.camera.core.impl;

import androidx.camera.core.impl.Config;
import java.util.Set;

public class CameraConfigs {
    private static final CameraConfig EMPTY_CONFIG = new EmptyCameraConfig();

    public static final class EmptyCameraConfig implements CameraConfig {
        private final Identifier mIdentifier = Identifier.create(new Object());

        public /* synthetic */ boolean containsOption(Config.Option option) {
            return C16539j.m15570a(this, option);
        }

        public /* synthetic */ void findOptions(String str, Config.OptionMatcher optionMatcher) {
            C16539j.m15571b(this, str, optionMatcher);
        }

        public Identifier getCompatibilityId() {
            return this.mIdentifier;
        }

        public Config getConfig() {
            return OptionsBundle.emptyBundle();
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

    private CameraConfigs() {
    }

    public static CameraConfig emptyConfig() {
        return EMPTY_CONFIG;
    }
}
