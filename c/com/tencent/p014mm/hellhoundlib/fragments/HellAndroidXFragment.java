package com.tencent.p014mm.hellhoundlib.fragments;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import i20.C117129d;
import i20.C21043a;

/* renamed from: com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment */
public class HellAndroidXFragment extends Fragment {
    private SparseArray<Object> mHellTags;

    public Object getHellTag(int i) {
        SparseArray<Object> sparseArray = this.mHellTags;
        if (sparseArray != null) {
            return sparseArray.get(i);
        }
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C21043a.m23197h().mo32750c(this, 7);
    }

    public void onDestroy() {
        super.onDestroy();
        C21043a.m23197h().mo32750c(this, 13);
    }

    public void onDestroyView() {
        super.onDestroyView();
        C21043a.m23197h().mo32750c(this, 12);
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        C21043a h = C21043a.m23197h();
        h.getClass();
        C117129d dVar = h.f59537a;
        if (dVar != null) {
            dVar.mo180797f(this, z);
        }
    }

    public void onPause() {
        super.onPause();
        C21043a.m23197h().mo32750c(this, 9);
    }

    public void onResume() {
        super.onResume();
        C21043a.m23197h().mo32750c(this, 8);
    }

    public void setHellTag(int i, Object obj) {
        if (this.mHellTags == null) {
            this.mHellTags = new SparseArray<>(2);
        }
        this.mHellTags.put(i, obj);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        C21043a h = C21043a.m23197h();
        h.getClass();
        C117129d dVar = h.f59537a;
        if (dVar != null) {
            dVar.mo180795d(this, z);
        }
    }
}
