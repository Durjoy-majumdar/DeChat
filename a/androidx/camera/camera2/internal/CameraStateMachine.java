package androidx.camera.camera2.internal;

import androidx.camera.core.CameraState;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.lifecycle.C54219z;
import androidx.lifecycle.LiveData;
import java.util.Objects;

class CameraStateMachine {
    private static final String TAG = "CameraStateMachine";
    private final CameraStateRegistry mCameraStateRegistry;
    private final C54219z<CameraState> mCameraStates;

    /* renamed from: androidx.camera.camera2.internal.CameraStateMachine$1 */
    public static /* synthetic */ class C164751 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$impl$CameraInternal$State;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.camera.core.impl.CameraInternal$State[] r0 = androidx.camera.core.impl.CameraInternal.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$camera$core$impl$CameraInternal$State = r0
                androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$androidx$camera$core$impl$CameraInternal$State     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.OPENING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$androidx$camera$core$impl$CameraInternal$State     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.OPEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$androidx$camera$core$impl$CameraInternal$State     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.CLOSING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$androidx$camera$core$impl$CameraInternal$State     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.RELEASING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$androidx$camera$core$impl$CameraInternal$State     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.CLOSED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$androidx$camera$core$impl$CameraInternal$State     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.RELEASED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.CameraStateMachine.C164751.<clinit>():void");
        }
    }

    public CameraStateMachine(CameraStateRegistry cameraStateRegistry) {
        this.mCameraStateRegistry = cameraStateRegistry;
        C54219z<CameraState> zVar = new C54219z<>();
        this.mCameraStates = zVar;
        zVar.postValue(CameraState.create(CameraState.Type.CLOSED));
    }

    private CameraState onCameraPendingOpen() {
        return this.mCameraStateRegistry.isCameraClosing() ? CameraState.create(CameraState.Type.OPENING) : CameraState.create(CameraState.Type.PENDING_OPEN);
    }

    public LiveData<CameraState> getStateLiveData() {
        return this.mCameraStates;
    }

    public void updateState(CameraInternal.State state, CameraState.StateError stateError) {
        CameraState cameraState;
        switch (C164751.$SwitchMap$androidx$camera$core$impl$CameraInternal$State[state.ordinal()]) {
            case 1:
                cameraState = onCameraPendingOpen();
                break;
            case 2:
                cameraState = CameraState.create(CameraState.Type.OPENING, stateError);
                break;
            case 3:
                cameraState = CameraState.create(CameraState.Type.OPEN, stateError);
                break;
            case 4:
            case 5:
                cameraState = CameraState.create(CameraState.Type.CLOSING, stateError);
                break;
            case 6:
            case 7:
                cameraState = CameraState.create(CameraState.Type.CLOSED, stateError);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + state);
        }
        Logger.m15471d(TAG, "New public camera state " + cameraState + " from " + state + " and " + stateError);
        if (!Objects.equals(this.mCameraStates.getValue(), cameraState)) {
            Logger.m15471d(TAG, "Publishing new public camera state " + cameraState);
            this.mCameraStates.postValue(cameraState);
        }
    }
}
