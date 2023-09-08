package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Camera2SessionConfigBuilder {
    private List<Camera2OutputConfig> mCamera2OutputConfigs = new ArrayList();
    private Map<CaptureRequest.Key<?>, Object> mSessionParameters = new HashMap();
    private int mSessionTemplateId = 1;

    public static class SessionConfigImpl implements Camera2SessionConfig {
        private final List<Camera2OutputConfig> mCamera2OutputConfigs;
        private final Map<CaptureRequest.Key<?>, Object> mSessionParameters;
        private final int mSessionTemplateId;

        public SessionConfigImpl(int i, Map<CaptureRequest.Key<?>, Object> map, List<Camera2OutputConfig> list) {
            this.mSessionTemplateId = i;
            this.mSessionParameters = map;
            this.mCamera2OutputConfigs = list;
        }

        public List<Camera2OutputConfig> getOutputConfigs() {
            return this.mCamera2OutputConfigs;
        }

        public Map<CaptureRequest.Key<?>, Object> getSessionParameters() {
            return this.mSessionParameters;
        }

        public int getSessionTemplateId() {
            return this.mSessionTemplateId;
        }
    }

    public Camera2SessionConfigBuilder addOutputConfig(Camera2OutputConfig camera2OutputConfig) {
        this.mCamera2OutputConfigs.add(camera2OutputConfig);
        return this;
    }

    public <T> Camera2SessionConfigBuilder addSessionParameter(CaptureRequest.Key<T> key, T t) {
        this.mSessionParameters.put(key, t);
        return this;
    }

    public Camera2SessionConfig build() {
        return new SessionConfigImpl(this.mSessionTemplateId, this.mSessionParameters, this.mCamera2OutputConfigs);
    }

    public List<Camera2OutputConfig> getCamera2OutputConfigs() {
        return this.mCamera2OutputConfigs;
    }

    public Map<CaptureRequest.Key<?>, Object> getSessionParameters() {
        return this.mSessionParameters;
    }

    public int getSessionTemplateId() {
        return this.mSessionTemplateId;
    }

    public Camera2SessionConfigBuilder setSessionTemplateId(int i) {
        this.mSessionTemplateId = i;
        return this;
    }
}
