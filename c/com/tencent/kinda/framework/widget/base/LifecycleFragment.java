package com.tencent.kinda.framework.widget.base;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;

abstract class LifecycleFragment extends MMFragment implements FragmentLifecycle {
    private static final String TAG = "MicroMsg.LifecycleFragment";
    public State mState = State.INITIAL;

    public enum State {
        INITIAL(0),
        CREATED(1),
        STARTED(2),
        RESUMED(3),
        PAUSED(4),
        STOPPED(5),
        DESTROYED(6);
        
        private int value;

        private State(int i) {
            this.value = i;
        }
    }

    private void _callFragmentOnCreate() {
        Log.m105919d(TAG, "_callFragmentOnCreate: %s", this.mState);
        if (this.mState == State.INITIAL) {
            this.mState = State.CREATED;
            onFragmentOnCreate();
        }
    }

    private void _callFragmentOnDestroy() {
        Log.m105919d(TAG, "_callFragmentOnDestroy: %s", this.mState);
        if (this.mState == State.STOPPED) {
            this.mState = State.DESTROYED;
            onFragmentOnDestroy();
        }
    }

    private void _callFragmentOnPause() {
        Log.m105919d(TAG, "_callFragmentOnPause: %s", this.mState);
        State state = this.mState;
        if (state == State.RESUMED || state == State.STARTED) {
            this.mState = State.PAUSED;
            onFragmentOnPause();
        }
    }

    private void _callFragmentOnResume() {
        Log.m105919d(TAG, "_callFragmentOnResume: %s", this.mState);
        State state = this.mState;
        if (state == State.STARTED || state == State.PAUSED) {
            this.mState = State.RESUMED;
            onFragmentOnResume();
        }
    }

    private void _callFragmentOnStart() {
        Log.m105919d(TAG, "_callFragmentOnStart: %s", this.mState);
        State state = this.mState;
        if (state == State.CREATED || state == State.STOPPED) {
            this.mState = State.STARTED;
            onFragmentOnStart();
        }
    }

    private void _callFragmentOnStop() {
        Log.m105919d(TAG, "_callFragmentOnStop: %s", this.mState);
        if (this.mState == State.PAUSED) {
            this.mState = State.STOPPED;
            onFragmentOnStop();
        }
    }

    private void _fixCallOnResumeOrOnPause() {
        if (getActivity() == null) {
            Log.m105928w(TAG, "null activity when call");
            return;
        }
        List<Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
        Log.m105919d(TAG, "call on resume or puase: %s", fragments);
        if (fragments.size() < 1 || fragments.get(fragments.size() - 1) != this) {
            _callFragmentOnPause();
        } else {
            _callFragmentOnResume();
        }
    }

    private void _fixOnPauseNotCallingProblem() {
        if (getActivity() == null) {
            Log.m105928w(TAG, "null activity when call");
            return;
        }
        List<Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
        Log.m105919d(TAG, "current fragments: %s", fragments);
        if (fragments.size() >= 2) {
            Fragment fragment = fragments.get(fragments.size() - 2);
            if (fragment instanceof LifecycleFragment) {
                ((LifecycleFragment) fragment)._callFragmentOnPause();
            }
        }
    }

    private void _fixOnResumeNotCallingProblem() {
        if (getActivity() == null) {
            Log.m105928w(TAG, "null activity when call");
            return;
        }
        List<Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
        Log.m105919d(TAG, "current fragments: %s", fragments);
        if (fragments.size() >= 1) {
            Fragment fragment = fragments.get(fragments.size() - 1);
            if (fragment instanceof LifecycleFragment) {
                ((LifecycleFragment) fragment)._callFragmentOnResume();
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        _callFragmentOnCreate();
        _fixOnPauseNotCallingProblem();
    }

    public void onDestroy() {
        super.onDestroy();
        _callFragmentOnDestroy();
        _fixOnResumeNotCallingProblem();
    }

    public void onDestroyView() {
        super.onDestroyView();
        _callFragmentOnDestroy();
        _fixOnResumeNotCallingProblem();
    }

    public void onFragmentOnCreate() {
        Log.m105919d(TAG, "lifecycle: onFragmentOnCreate, class: %s", toString());
    }

    public void onFragmentOnDestroy() {
        Log.m105919d(TAG, "lifecycle: onFragmentOnDestroy, class: %s", toString());
    }

    public void onFragmentOnPause() {
        Log.m105919d(TAG, "lifecycle: onFragmentOnPause, class: %s", toString());
    }

    public void onFragmentOnResume() {
        Log.m105919d(TAG, "lifecycle: onFragmentOnResume, class: %s", toString());
    }

    public void onFragmentOnStart() {
        Log.m105919d(TAG, "lifecycle: onFragmentOnStart, class: %s", toString());
    }

    public void onFragmentOnStop() {
        Log.m105919d(TAG, "lifecycle: onFragmentOnStop, class: %s", toString());
    }

    public void onPause() {
        super.onPause();
        _callFragmentOnPause();
    }

    public void onResume() {
        super.onResume();
        _fixCallOnResumeOrOnPause();
    }

    public void onStart() {
        super.onStart();
        _callFragmentOnStart();
    }

    public void onStop() {
        super.onStop();
        _callFragmentOnStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        _callFragmentOnCreate();
        _fixOnPauseNotCallingProblem();
    }
}
