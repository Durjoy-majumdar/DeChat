package androidx.camera.core.impl;

import androidx.camera.core.Logger;
import androidx.camera.core.impl.SessionConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class UseCaseAttachState {
    private static final String TAG = "UseCaseAttachState";
    private final Map<String, UseCaseAttachInfo> mAttachedUseCasesToInfoMap = new LinkedHashMap();
    private final String mCameraId;

    public interface AttachStateFilter {
        boolean filter(UseCaseAttachInfo useCaseAttachInfo);
    }

    public static final class UseCaseAttachInfo {
        private boolean mActive = false;
        private boolean mAttached = false;
        private final SessionConfig mSessionConfig;

        public UseCaseAttachInfo(SessionConfig sessionConfig) {
            this.mSessionConfig = sessionConfig;
        }

        public boolean getActive() {
            return this.mActive;
        }

        public boolean getAttached() {
            return this.mAttached;
        }

        public SessionConfig getSessionConfig() {
            return this.mSessionConfig;
        }

        public void setActive(boolean z) {
            this.mActive = z;
        }

        public void setAttached(boolean z) {
            this.mAttached = z;
        }
    }

    public UseCaseAttachState(String str) {
        this.mCameraId = str;
    }

    private UseCaseAttachInfo getOrCreateUseCaseAttachInfo(String str, SessionConfig sessionConfig) {
        UseCaseAttachInfo useCaseAttachInfo = this.mAttachedUseCasesToInfoMap.get(str);
        if (useCaseAttachInfo != null) {
            return useCaseAttachInfo;
        }
        UseCaseAttachInfo useCaseAttachInfo2 = new UseCaseAttachInfo(sessionConfig);
        this.mAttachedUseCasesToInfoMap.put(str, useCaseAttachInfo2);
        return useCaseAttachInfo2;
    }

    private Collection<SessionConfig> getSessionConfigs(AttachStateFilter attachStateFilter) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.mAttachedUseCasesToInfoMap.entrySet()) {
            if (attachStateFilter == null || attachStateFilter.filter((UseCaseAttachInfo) next.getValue())) {
                arrayList.add(((UseCaseAttachInfo) next.getValue()).getSessionConfig());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getActiveAndAttachedSessionConfigs$1(UseCaseAttachInfo useCaseAttachInfo) {
        return useCaseAttachInfo.getActive() && useCaseAttachInfo.getAttached();
    }

    public SessionConfig.ValidatingBuilder getActiveAndAttachedBuilder() {
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.mAttachedUseCasesToInfoMap.entrySet()) {
            UseCaseAttachInfo useCaseAttachInfo = (UseCaseAttachInfo) next.getValue();
            if (useCaseAttachInfo.getActive() && useCaseAttachInfo.getAttached()) {
                validatingBuilder.add(useCaseAttachInfo.getSessionConfig());
                arrayList.add((String) next.getKey());
            }
        }
        Logger.m15471d(TAG, "Active and attached use case: " + arrayList + " for camera: " + this.mCameraId);
        return validatingBuilder;
    }

    public Collection<SessionConfig> getActiveAndAttachedSessionConfigs() {
        return Collections.unmodifiableCollection(getSessionConfigs(new UseCaseAttachState$$b()));
    }

    public SessionConfig.ValidatingBuilder getAttachedBuilder() {
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.mAttachedUseCasesToInfoMap.entrySet()) {
            UseCaseAttachInfo useCaseAttachInfo = (UseCaseAttachInfo) next.getValue();
            if (useCaseAttachInfo.getAttached()) {
                validatingBuilder.add(useCaseAttachInfo.getSessionConfig());
                arrayList.add((String) next.getKey());
            }
        }
        Logger.m15471d(TAG, "All use case: " + arrayList + " for camera: " + this.mCameraId);
        return validatingBuilder;
    }

    public Collection<SessionConfig> getAttachedSessionConfigs() {
        return Collections.unmodifiableCollection(getSessionConfigs(new UseCaseAttachState$$a()));
    }

    public boolean isUseCaseAttached(String str) {
        if (!this.mAttachedUseCasesToInfoMap.containsKey(str)) {
            return false;
        }
        return this.mAttachedUseCasesToInfoMap.get(str).getAttached();
    }

    public void removeUseCase(String str) {
        this.mAttachedUseCasesToInfoMap.remove(str);
    }

    public void setUseCaseActive(String str, SessionConfig sessionConfig) {
        getOrCreateUseCaseAttachInfo(str, sessionConfig).setActive(true);
    }

    public void setUseCaseAttached(String str, SessionConfig sessionConfig) {
        getOrCreateUseCaseAttachInfo(str, sessionConfig).setAttached(true);
    }

    public void setUseCaseDetached(String str) {
        if (this.mAttachedUseCasesToInfoMap.containsKey(str)) {
            UseCaseAttachInfo useCaseAttachInfo = this.mAttachedUseCasesToInfoMap.get(str);
            useCaseAttachInfo.setAttached(false);
            if (!useCaseAttachInfo.getActive()) {
                this.mAttachedUseCasesToInfoMap.remove(str);
            }
        }
    }

    public void setUseCaseInactive(String str) {
        if (this.mAttachedUseCasesToInfoMap.containsKey(str)) {
            UseCaseAttachInfo useCaseAttachInfo = this.mAttachedUseCasesToInfoMap.get(str);
            useCaseAttachInfo.setActive(false);
            if (!useCaseAttachInfo.getAttached()) {
                this.mAttachedUseCasesToInfoMap.remove(str);
            }
        }
    }

    public void updateUseCase(String str, SessionConfig sessionConfig) {
        if (this.mAttachedUseCasesToInfoMap.containsKey(str)) {
            UseCaseAttachInfo useCaseAttachInfo = new UseCaseAttachInfo(sessionConfig);
            UseCaseAttachInfo useCaseAttachInfo2 = this.mAttachedUseCasesToInfoMap.get(str);
            useCaseAttachInfo.setAttached(useCaseAttachInfo2.getAttached());
            useCaseAttachInfo.setActive(useCaseAttachInfo2.getActive());
            this.mAttachedUseCasesToInfoMap.put(str, useCaseAttachInfo);
        }
    }
}
