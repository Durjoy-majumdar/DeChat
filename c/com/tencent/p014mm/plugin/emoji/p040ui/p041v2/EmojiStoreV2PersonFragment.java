package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonStoreActionStruct;
import com.tencent.p014mm.plugin.emoji.model.C41051m;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C117747y;
import q61.C101038b;
import te3.C101824o80;
import w51.C102340h;
import x51.C102554b;
import x51.C102562g;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2PersonFragment */
public class EmojiStoreV2PersonFragment extends EmojiStoreV2BaseFragment {

    /* renamed from: P */
    public boolean f268829P = false;

    /* renamed from: Q */
    public C102340h f268830Q;

    /* renamed from: L */
    public void mo127817L(int i, int i2, C117747y yVar) {
        super.mo127817L(i, i2, yVar);
        EmojiStoreV2HotBarView emojiStoreV2HotBarView = this.f268800o;
        if (emojiStoreV2HotBarView == null) {
            return;
        }
        if (C41051m.m44498a().f110535c) {
            emojiStoreV2HotBarView.f12260e.setText(C0966R.string.c6f);
        } else {
            emojiStoreV2HotBarView.f12260e.setText(C0966R.string.c6e);
        }
    }

    /* renamed from: M */
    public int mo127818M() {
        return 9;
    }

    /* renamed from: P */
    public boolean mo127821P() {
        return false;
    }

    /* renamed from: Q */
    public C102554b mo127822Q() {
        C102340h hVar = new C102340h(getContext(), false);
        this.f268830Q = hVar;
        return hVar;
    }

    /* renamed from: S */
    public void mo127824S() {
        try {
            int firstVisiblePosition = this.f268802q.getFirstVisiblePosition();
            if (firstVisiblePosition < 1) {
                firstVisiblePosition = 1;
            }
            int lastVisiblePosition = this.f268802q.getLastVisiblePosition();
            if (lastVisiblePosition - firstVisiblePosition > 0) {
                LinkedList linkedList = new LinkedList();
                for (int i = firstVisiblePosition - 1; i < lastVisiblePosition - 1; i++) {
                    for (int i2 = 0; i2 < 3; i2++) {
                        C102340h hVar = this.f268830Q;
                        C102562g g = hVar.getItem((hVar.f301433t ? hVar.f301428o * i : (hVar.f301428o * i) + hVar.f301429p) + i2);
                        if (g != null) {
                            C101824o80 o802 = g.f301983b;
                            if (o802 != null) {
                                linkedList.add(new C101038b(i + 1, o802.f298996f, o802));
                            }
                        }
                    }
                }
                EmoticonStoreActionStruct emoticonStoreActionStruct = this.f268784G;
                emoticonStoreActionStruct.f265470f = 1;
                C101038b.f295826d.mo140508a(emoticonStoreActionStruct, linkedList);
                this.f268784G.mo86054n();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.emoji.EmojiStoreV2PersonFragment", e, "", new Object[0]);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a2v;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onAttach");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onCreate");
        this.f268784G.f265469e = 2;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onCreateView");
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onDestroy");
    }

    public void onDestroyView() {
        super.onDestroyView();
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onResume");
    }

    public void onDetach() {
        super.onDetach();
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onDestroy");
    }

    public void onPause() {
        super.onPause();
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onPause");
    }

    public void onResume() {
        super.onResume();
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onResume");
        EmojiStoreV2HotBarView emojiStoreV2HotBarView = this.f268800o;
        if (emojiStoreV2HotBarView != null) {
            emojiStoreV2HotBarView.mo2113b();
        }
    }

    public void onStart() {
        super.onStart();
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onStart");
    }

    public void onStop() {
        super.onStop();
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onStop");
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!this.f268829P && z) {
            this.f268829P = true;
            C115669n.INSTANCE.mo160131h(12740, 4, "", "", "", 2, 2);
        }
    }
}
