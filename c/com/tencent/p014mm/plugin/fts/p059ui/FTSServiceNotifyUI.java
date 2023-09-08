package com.tencent.p014mm.plugin.fts.p059ui;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.fts.C93829e;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86737h0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kv1.C99251g;
import kv1.C99260q;
import ov1.C100558d;

@C86737h0
/* renamed from: com.tencent.mm.plugin.fts.ui.FTSServiceNotifyUI */
public class FTSServiceNotifyUI extends FTSBaseUI implements View.OnClickListener {

    /* renamed from: o */
    public String f52817o;

    /* renamed from: p */
    public int f52818p;

    /* renamed from: q */
    public String f52819q;

    /* renamed from: r */
    public View f52820r;

    /* renamed from: s */
    public TextView f52821s;

    /* renamed from: t */
    public boolean f52822t = true;

    /* renamed from: u */
    public C18844c0 f52823u;

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSServiceNotifyUI$a */
    public class C4405a extends RecyclerView.C0129l {

        /* renamed from: d */
        public final int f19083d;

        /* renamed from: e */
        public final int f19084e;

        /* renamed from: f */
        public Paint f19085f = new Paint(1);

        public C4405a(FTSServiceNotifyUI fTSServiceNotifyUI) {
            this.f19083d = C76577a.m92151b(fTSServiceNotifyUI.getContext(), 37);
            this.f19084e = C76577a.m92151b(fTSServiceNotifyUI.getContext(), 18);
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            super.mo21g(rect, view, recyclerView, wVar);
            int i = this.f19083d;
            int i2 = this.f19084e;
            rect.set(i, i2, i, i2);
        }

        /* renamed from: h */
        public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            this.f19085f.setColor(-2434342);
            this.f19085f.setStrokeWidth(1.0f);
            this.f19085f.setStyle(Paint.Style.FILL);
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (i == 0) {
                    canvas.drawLine((float) (childAt.getRight() + this.f19083d), (float) childAt.getTop(), (float) (childAt.getRight() + this.f19083d), (float) childAt.getBottom(), this.f19085f);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSServiceNotifyUI$c */
    public class C4406c extends RecyclerView.C16613e<C4407d> {

        /* renamed from: d */
        public String[] f19086d;

        public C4406c() {
            String[] strArr = new String[2];
            this.f19086d = strArr;
            strArr[0] = FTSServiceNotifyUI.this.getResources().getString(C0966R.string.ihz);
            this.f19086d[1] = FTSServiceNotifyUI.this.getResources().getString(C0966R.string.igb);
        }

        public int getItemCount() {
            return this.f19086d.length;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C4407d dVar = (C4407d) zVar;
            dVar.f19088z.setTag(Integer.valueOf(i));
            dVar.f19088z.setText(this.f19086d[i]);
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            FTSServiceNotifyUI fTSServiceNotifyUI = FTSServiceNotifyUI.this;
            return new C4407d(fTSServiceNotifyUI, LayoutInflater.from(fTSServiceNotifyUI.getContext()).inflate(C0966R.C0971layout.at5, (ViewGroup) null));
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSServiceNotifyUI$d */
    public class C4407d extends RecyclerView.C16631z {

        /* renamed from: z */
        public TextView f19088z;

        public C4407d(FTSServiceNotifyUI fTSServiceNotifyUI, View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.knx);
            this.f19088z = textView;
            textView.setTextSize(17.0f);
            this.f19088z.setOnClickListener(fTSServiceNotifyUI);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSServiceNotifyUI$b */
    public class C18838b implements Runnable {
        public C18838b() {
        }

        public void run() {
            if (!FTSServiceNotifyUI.this.isFinishing() && !FTSServiceNotifyUI.this.isDestroyed()) {
                FTSServiceNotifyUI.this.f52754h.getFtsEditText().mo70355k();
                FTSServiceNotifyUI.this.f52754h.getFtsEditText().mo70361q();
            }
        }
    }

    /* renamed from: H7 */
    public C18852m mo23744H7(C18854q qVar) {
        if (this.f52823u == null) {
            this.f52823u = new C18844c0(qVar, this.f52817o, this.f52818p);
        }
        return this.f52823u;
    }

    /* renamed from: I7 */
    public void mo23780I7(String str) {
        super.mo23780I7(str);
        if (this.f52822t && this.f52818p == 1) {
            C115669n.INSTANCE.mo160131h(23903, 4, Long.valueOf(Util.nowSecond()), null, 0);
        }
        this.f52822t = false;
    }

    /* renamed from: K7 */
    public void mo23782K7() {
        this.f52817o = getIntent().getStringExtra("detail_username");
        this.f52818p = getIntent().getIntExtra("Search_Scene", 0);
        this.f52819q = getIntent().getStringExtra("Search_Str");
        Log.m105925i("MicroMsg.FTS.FTSServiceNotifyUI", "initSearchData conversation=%s", this.f52817o);
    }

    /* renamed from: M7 */
    public void mo23783M7() {
        super.mo23783M7();
        if (this.f52818p == 1) {
            View view = this.f52820r;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "setEmptyQueryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "setEmptyQueryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: N7 */
    public void mo23784N7() {
        super.mo23784N7();
        View view = this.f52820r;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "setExistResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "setExistResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: O7 */
    public void mo23785O7() {
        super.mo23785O7();
        View view = this.f52820r;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "setNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "setNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: P7 */
    public void mo23786P7() {
        super.mo23786P7();
        View view = this.f52820r;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "setSearchLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "setSearchLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.asu;
    }

    public void initView() {
        super.initView();
        hideActionbarLine();
        this.f52820r = findViewById(C0966R.C0970id.j6s);
        TextView textView = (TextView) findViewById(C0966R.C0970id.j74);
        this.f52821s = textView;
        textView.setTextSize(15.0f);
        if (this.f52818p == 1) {
            View view = this.f52820r;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f52821s.setVisibility(0);
            this.f52821s.setText(C0966R.string.ihw);
            RecyclerView recyclerView = (RecyclerView) findViewById(C0966R.C0970id.epk);
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
            recyclerView.mo17085h0(new C4405a(this));
            recyclerView.setAdapter(new C4406c());
        } else {
            View view2 = this.f52820r;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f52821s.setVisibility(8);
        }
        if (this.f52818p == 4 && !Util.isNullOrNil(this.f52819q)) {
            String o = C99251g.m129294o(this.f52819q);
            if (Util.isNullOrNil(this.f52756j) || !this.f52756j.equals(o)) {
                String str = this.f52819q;
                this.f52756j = str;
                this.f52754h.getFtsEditText().mo70356l(str, (List<FTSSearchView.C6996f>) null);
                mo23780I7(o);
                return;
            }
            Log.m105925i("MicroMsg.FTS.FTSServiceNotifyUI", "Same query %s %s", this.f52756j, o);
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view instanceof TextView)) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue == 0) {
            Log.m105924i("MicroMsg.FTS.FTSServiceNotifyUI", "onSearchMemberDetail");
            Intent intent = new Intent();
            intent.putExtra("from_scene", 1);
            intent.putExtra("RoomInfo_Id", "notifymessage");
            intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, getResources().getString(C0966R.string.ig8));
            C88144b.m109801s(this, "com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI", intent, (Bundle) null);
            C115669n.INSTANCE.mo160131h(23903, 2, Long.valueOf(Util.nowSecond()), null, 0);
        } else if (intValue == 1) {
            Log.m105924i("MicroMsg.FTS.FTSServiceNotifyUI", "onSearchDateDetail");
            Intent intent2 = new Intent();
            intent2.putExtra("detail_username", "notifymessage");
            C88144b.m109801s(this, "com.tencent.mm.chatroom.ui.SelectDateUI", intent2, (Bundle) null);
            C115669n.INSTANCE.mo160131h(23903, 3, Long.valueOf(Util.nowSecond()), null, 0);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        C100558d Ta = ((C99260q) C86312j.m106911c(C99260q.class)).mo128746Ta();
        if (Ta != null) {
            ((C93829e) Ta).mo128779g();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f52823u.mo23815g();
        C100558d Ta = ((C99260q) C86312j.m106911c(C99260q.class)).mo128746Ta();
        if (Ta != null) {
            ((C93829e) Ta).mo128780h();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f52818p != 4) {
            this.f52820r.postDelayed(new C18838b(), 128);
        }
    }
}
