package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonStoreActionStruct;
import com.tencent.p014mm.plugin.emoji.model.C41051m;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import q61.C101038b;
import te3.C101824o80;
import w51.C102338g;
import x51.C102554b;
import x51.C102562g;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2MainFragment */
public class EmojiStoreV2MainFragment extends EmojiStoreV2BaseFragment {

    /* renamed from: P */
    public boolean f268826P = false;

    /* renamed from: Q */
    public C102338g f268827Q;

    /* renamed from: R */
    public boolean f268828R = false;

    /* renamed from: M */
    public int mo127818M() {
        return 5;
    }

    /* renamed from: P */
    public boolean mo127821P() {
        return true;
    }

    /* renamed from: Q */
    public C102554b mo127822Q() {
        C102338g gVar = new C102338g(getContext());
        this.f268827Q = gVar;
        return gVar;
    }

    /* renamed from: S */
    public void mo127824S() {
        try {
            ListView listView = this.f268802q;
            if (listView == null) {
                return;
            }
            if (this.f268827Q != null) {
                int firstVisiblePosition = listView.getFirstVisiblePosition();
                int lastVisiblePosition = this.f268802q.getLastVisiblePosition();
                if (lastVisiblePosition - firstVisiblePosition > 0) {
                    boolean z = C41051m.m44498a().f110536d;
                    LinkedList linkedList = new LinkedList();
                    while (firstVisiblePosition < lastVisiblePosition) {
                        C102562g g = this.f268827Q.mo141906g(firstVisiblePosition);
                        if (g != null) {
                            C101824o80 o802 = g.f301983b;
                            if (o802 != null) {
                                linkedList.add(new C101038b(firstVisiblePosition + 1, z ? o802.f299013z : o802.f299011x, o802));
                            }
                        }
                        firstVisiblePosition++;
                    }
                    EmoticonStoreActionStruct emoticonStoreActionStruct = this.f268784G;
                    emoticonStoreActionStruct.f265470f = 1;
                    C101038b.f295826d.mo140508a(emoticonStoreActionStruct, linkedList);
                    this.f268784G.mo86054n();
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.emoji.EmojiStoreV2MainFragment", e, "", new Object[0]);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a2t;
    }

    public void onActivityCreated(Bundle bundle) {
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2MainFragment", "onActivityCreated");
        if (this.f268828R) {
            mo127816K(bundle);
        } else {
            super.onActivityCreated(bundle);
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2MainFragment", "onAttach");
    }

    public void onCreate(Bundle bundle) {
        this.f268828R = EmojiLogic.m117470a();
        super.onCreate(bundle);
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2MainFragment", "onCreate");
        this.f268784G.f265469e = 1;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2MainFragment", "onCreateView");
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2MainFragment", "onDestroy");
    }

    public void onDestroyView() {
        super.onDestroyView();
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2MainFragment", "onResume");
    }

    public void onDetach() {
        super.onDetach();
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2MainFragment", "onDestroy");
    }

    public void onPause() {
        super.onPause();
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2MainFragment", "onPause");
    }

    public void onResume() {
        super.onResume();
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2MainFragment", "onResume");
    }

    public void onStart() {
        super.onStart();
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2MainFragment", "onStart");
    }

    public void onStop() {
        super.onStop();
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2MainFragment", "onStop");
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!this.f268826P && z) {
            this.f268826P = true;
            C115669n.INSTANCE.mo160131h(12740, 4, "", "", "", 1, 1);
        }
    }
}
