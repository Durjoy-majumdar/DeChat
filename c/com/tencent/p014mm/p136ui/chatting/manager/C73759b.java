package com.tencent.p014mm.p136ui.chatting.manager;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;
import ke3.C88144b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.manager.b */
public class C73759b implements C88144b.C88145d {

    /* renamed from: b */
    public static WeakHashMap<Fragment, HashMap<Integer, C88144b.C76564c>> f216516b = new WeakHashMap<>();

    /* renamed from: a */
    public WeakReference<C67391b> f216517a;

    public C73759b(C67391b bVar) {
        this.f216517a = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public void mo102813a(Intent intent, int i, C88144b.C76564c cVar) {
        C67391b bVar = this.f216517a.get();
        BaseChattingUIFragment baseChattingUIFragment = bVar != null ? bVar.f193286j : null;
        if (baseChattingUIFragment != null) {
            HashMap hashMap = f216516b.get(baseChattingUIFragment);
            if (hashMap == null) {
                hashMap = new HashMap();
                f216516b.put(baseChattingUIFragment, hashMap);
                ((C119157j) C119157j.f356862d).mo183895z(new ChattingOnResultExecutor$1(this, baseChattingUIFragment));
            }
            hashMap.put(Integer.valueOf(i), cVar);
            baseChattingUIFragment.startActivityForResult(intent, i);
        }
    }

    public Context getContext() {
        C67391b bVar = this.f216517a.get();
        return (bVar != null ? bVar.f193286j : null).getActivity();
    }
}
