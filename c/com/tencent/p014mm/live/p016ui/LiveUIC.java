package com.tencent.p014mm.live.p016ui;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.p136ui.MMActivity;
import di3.C86312j;
import f40.C86709a0;
import f60.C7983a;
import f62.C75700k0;
import gy3.C87412m;
import i60.C8851b;
import i60.C8858i;
import java.util.ArrayList;
import kotlin.Metadata;
import ob0.C11385n;
import ob0.C117747y;
import p740wo.C53193b;
import rx3.C13604l;
import y50.C66519j0;
import z50.C16105d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/live/ui/LiveUIC;", "Lcom/tencent/mm/ui/MMActivity;", "Lob0/n;", "<init>", "()V", "plugin-logic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.ui.LiveUIC */
public final class LiveUIC extends MMActivity implements C11385n {

    /* renamed from: d */
    public RecyclerView f10328d;

    /* renamed from: e */
    public TextView f10329e;

    /* renamed from: f */
    public TextView f10330f;

    /* renamed from: g */
    public ProgressBar f10331g;

    /* renamed from: h */
    public TextView f10332h;

    /* renamed from: i */
    public final C8851b f10333i = new C8851b();

    public int getLayoutId() {
        return C0966R.C0971layout.f359855b63;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107529k().f251779b.mo123455a(3700, this);
        setMMTitle(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(RoomLiveService.f157192c).mo62898f());
        setBackBtn(new C7983a(this));
        ViewGroup viewGroup = (ViewGroup) findViewById(C0966R.C0970id.fqh);
        ViewGroup viewGroup2 = (ViewGroup) findViewById(C0966R.C0970id.fqn);
        this.f10328d = (RecyclerView) findViewById(C0966R.C0970id.fqf);
        TextView textView = (TextView) findViewById(C0966R.C0970id.fql);
        this.f10329e = (TextView) findViewById(C0966R.C0970id.fqj);
        this.f10330f = (TextView) findViewById(C0966R.C0970id.fqp);
        this.f10331g = (ProgressBar) findViewById(C0966R.C0970id.fqg);
        this.f10332h = (TextView) findViewById(C0966R.C0970id.fqk);
        RecyclerView recyclerView = this.f10328d;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RecyclerView recyclerView2 = this.f10328d;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f10333i);
        }
        int p1 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(RoomLiveService.f157192c);
        TextView textView2 = this.f10329e;
        if (textView2 != null) {
            textView2.setText(String.valueOf(RoomLiveService.f157197h.f133055i));
        }
        TextView textView3 = this.f10330f;
        if (textView3 != null) {
            textView3.setText(String.valueOf(p1));
        }
        ProgressBar progressBar = this.f10331g;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        TextView textView4 = this.f10332h;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        RecyclerView recyclerView3 = this.f10328d;
        if (recyclerView3 != null) {
            recyclerView3.setVisibility(8);
        }
        C66519j0 j0Var = C66519j0.f191358d;
        String str = RoomLiveService.f157192c;
        C87412m.m108594g(str, "wechatRoomId");
        C86709a0.m107529k().f251779b.mo123460f(new C16105d(RoomLiveService.f157197h.f133050d, str));
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107529k().f251779b.mo123470p(3700, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (!(yVar instanceof C16105d)) {
            return;
        }
        if (i == 0 && i2 == 0) {
            TextView textView = this.f10329e;
            if (textView != null) {
                textView.setText(String.valueOf(RoomLiveService.f157197h.f133055i));
            }
            ProgressBar progressBar = this.f10331g;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView2 = this.f10332h;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            RecyclerView recyclerView = this.f10328d;
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
            C13604l lVar = RoomLiveService.f157194e.get(RoomLiveService.f157192c);
            ArrayList<String> arrayList = lVar != null ? (ArrayList) lVar.f38555d : null;
            ArrayList arrayList2 = new ArrayList();
            if (arrayList != null) {
                for (String iVar : arrayList) {
                    arrayList2.add(new C8858i(iVar));
                }
            }
            C8851b bVar = this.f10333i;
            bVar.getClass();
            bVar.f28101d.clear();
            bVar.f28101d.addAll(arrayList2);
            this.f10333i.notifyDataSetChanged();
            return;
        }
        ProgressBar progressBar2 = this.f10331g;
        if (progressBar2 != null) {
            progressBar2.setVisibility(8);
        }
        TextView textView3 = this.f10332h;
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        RecyclerView recyclerView2 = this.f10328d;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
    }
}
