package com.tencent.p014mm.plugin.fts.p059ui;

import a11.C39479c;
import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.fts.C93829e;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f40.C86737h0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kv1.C99260q;
import ov1.C100558d;
import pv1.C22019b;

@C86737h0
/* renamed from: com.tencent.mm.plugin.fts.ui.FTSChattingConvUI */
public class FTSChattingConvUI extends FTSBaseUI implements View.OnClickListener {

    /* renamed from: o */
    public String f52787o;

    /* renamed from: p */
    public boolean f52788p = false;

    /* renamed from: q */
    public View f52789q;

    /* renamed from: r */
    public boolean f52790r = true;

    /* renamed from: s */
    public C44661m1 f52791s;

    /* renamed from: t */
    public int f52792t;

    /* renamed from: u */
    public C18858v f52793u;

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSChattingConvUI$a */
    public class C4404a extends RecyclerView.C0129l {

        /* renamed from: d */
        public final int f19081d;

        /* renamed from: e */
        public Paint f19082e = new Paint(1);

        public C4404a(FTSChattingConvUI fTSChattingConvUI) {
            this.f19081d = (int) fTSChattingConvUI.getResources().getDimension(C0966R.dimen.f3627k);
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            super.mo21g(rect, view, recyclerView, wVar);
            int i = this.f19081d;
            rect.set(i, i, i, i);
        }

        /* renamed from: h */
        public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            this.f19082e.setColor(-2434342);
            this.f19082e.setStrokeWidth(1.0f);
            this.f19082e.setStyle(Paint.Style.FILL);
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (i == 1 || i == 4) {
                    canvas.drawLine((float) (childAt.getLeft() - this.f19081d), (float) childAt.getTop(), (float) (childAt.getLeft() - this.f19081d), (float) childAt.getBottom(), this.f19082e);
                    canvas.drawLine((float) (childAt.getRight() + this.f19081d), (float) childAt.getTop(), (float) (childAt.getRight() + this.f19081d), (float) childAt.getBottom(), this.f19082e);
                } else if (i == 7) {
                    canvas.drawLine((float) (childAt.getLeft() - this.f19081d), (float) childAt.getTop(), (float) (childAt.getLeft() - this.f19081d), (float) childAt.getBottom(), this.f19082e);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSChattingConvUI$b */
    public class C18829b implements Runnable {
        public C18829b() {
        }

        public void run() {
            FTSChattingConvUI.this.f52754h.getFtsEditText().mo70355k();
            FTSChattingConvUI.this.f52754h.getFtsEditText().mo70361q();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSChattingConvUI$c */
    public class C18830c extends RecyclerView.C16613e<C18831d> {

        /* renamed from: d */
        public String[] f52795d;

        /* renamed from: e */
        public final /* synthetic */ FTSChattingConvUI f52796e;

        public C18830c(FTSChattingConvUI fTSChattingConvUI) {
            FTSChattingConvUI fTSChattingConvUI2 = fTSChattingConvUI;
            this.f52796e = fTSChattingConvUI2;
            if (!C72996z1.m85820U5(fTSChattingConvUI2.f52787o)) {
                String[] strArr = new String[7];
                this.f52795d = strArr;
                strArr[0] = fTSChattingConvUI.getResources().getString(C0966R.string.igb);
                this.f52795d[1] = fTSChattingConvUI.getResources().getString(C0966R.string.igd);
                this.f52795d[2] = fTSChattingConvUI.getResources().getString(C0966R.string.igc);
                this.f52795d[3] = fTSChattingConvUI.getResources().getString(C0966R.string.igh);
                this.f52795d[4] = fTSChattingConvUI.getResources().getString(C0966R.string.igf);
                this.f52795d[5] = fTSChattingConvUI.getResources().getString(C0966R.string.igg);
                this.f52795d[6] = fTSChattingConvUI.getResources().getString(C0966R.string.iga);
                return;
            }
            String[] strArr2 = new String[8];
            this.f52795d = strArr2;
            strArr2[0] = fTSChattingConvUI.getResources().getString(C0966R.string.ige);
            this.f52795d[1] = fTSChattingConvUI.getResources().getString(C0966R.string.igb);
            this.f52795d[2] = fTSChattingConvUI.getResources().getString(C0966R.string.igd);
            this.f52795d[3] = fTSChattingConvUI.getResources().getString(C0966R.string.igc);
            this.f52795d[4] = fTSChattingConvUI.getResources().getString(C0966R.string.igh);
            this.f52795d[5] = fTSChattingConvUI.getResources().getString(C0966R.string.igf);
            this.f52795d[6] = fTSChattingConvUI.getResources().getString(C0966R.string.igg);
            this.f52795d[7] = fTSChattingConvUI.getResources().getString(C0966R.string.iga);
        }

        public int getItemCount() {
            return this.f52795d.length;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C18831d dVar = (C18831d) zVar;
            dVar.f52797z.setTag(Integer.valueOf(i));
            dVar.f52797z.setText(this.f52795d[i]);
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            FTSChattingConvUI fTSChattingConvUI = this.f52796e;
            return new C18831d(fTSChattingConvUI, LayoutInflater.from(fTSChattingConvUI.getContext()).inflate(C0966R.C0971layout.at5, (ViewGroup) null));
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSChattingConvUI$d */
    public class C18831d extends RecyclerView.C16631z {

        /* renamed from: z */
        public TextView f52797z;

        public C18831d(FTSChattingConvUI fTSChattingConvUI, View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.knx);
            this.f52797z = textView;
            textView.setOnClickListener(fTSChattingConvUI);
        }
    }

    /* renamed from: H7 */
    public C18852m mo23744H7(C18854q qVar) {
        if (this.f52793u == null) {
            this.f52793u = new C18858v(qVar, this.f52787o);
        }
        return this.f52793u;
    }

    /* renamed from: I7 */
    public void mo23780I7(String str) {
        super.mo23780I7(str);
        if (!Util.isNullOrNil(str)) {
            this.f52790r = false;
        }
        int U5 = C72996z1.m85820U5(this.f52787o);
        if (this.f52788p) {
            U5 = 2;
        }
        C115669n.INSTANCE.mo160131h(14569, 0, 1, 0, 0, 0, 0, 0, Integer.valueOf(this.f52792t), Integer.valueOf(U5));
    }

    /* renamed from: K7 */
    public void mo23782K7() {
        this.f52787o = getIntent().getStringExtra("detail_username");
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f52787o);
        this.f52788p = getIntent().getBooleanExtra("detail_user_dismiss", false);
        Log.m105925i("MicroMsg.FTS.FTSChattingConvUI", "initSearchData conversation=%s", this.f52787o);
    }

    /* renamed from: M7 */
    public void mo23783M7() {
        super.mo23783M7();
        View view = this.f52789q;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "setEmptyQueryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "setEmptyQueryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: N7 */
    public void mo23784N7() {
        super.mo23784N7();
        View view = this.f52789q;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "setExistResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "setExistResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: O7 */
    public void mo23785O7() {
        super.mo23785O7();
        View view = this.f52789q;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "setNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "setNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: P7 */
    public void mo23786P7() {
        super.mo23786P7();
        View view = this.f52789q;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "setSearchLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "setSearchLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: S7 */
    public final void mo23800S7(int i) {
        int i2 = 2;
        if (C72996z1.m85820U5(this.f52787o)) {
            C44661m1 SE = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69801SE(this.f52787o);
            if (SE.mo69790r2() == null) {
                return;
            }
            if (i == 0) {
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[9];
                objArr[0] = 0;
                objArr[1] = 0;
                objArr[2] = 1;
                objArr[3] = 0;
                objArr[4] = 0;
                objArr[5] = 0;
                objArr[6] = 0;
                objArr[7] = Integer.valueOf(SE.mo69790r2().size());
                if (!this.f52788p) {
                    i2 = 1;
                }
                objArr[8] = Integer.valueOf(i2);
                nVar.mo160131h(14569, objArr);
                return;
            }
            C115669n nVar2 = C115669n.INSTANCE;
            Object[] objArr2 = new Object[9];
            objArr2[0] = 0;
            objArr2[1] = 0;
            objArr2[2] = 0;
            objArr2[3] = 1;
            objArr2[4] = 0;
            objArr2[5] = 0;
            objArr2[6] = 0;
            objArr2[7] = Integer.valueOf(SE.mo69790r2().size());
            if (!this.f52788p) {
                i2 = 1;
            }
            objArr2[8] = Integer.valueOf(i2);
            nVar2.mo160131h(14569, objArr2);
        } else if (i == 0) {
            C115669n nVar3 = C115669n.INSTANCE;
            Object[] objArr3 = new Object[9];
            objArr3[0] = 0;
            objArr3[1] = 0;
            objArr3[2] = 1;
            objArr3[3] = 0;
            objArr3[4] = 0;
            objArr3[5] = 0;
            objArr3[6] = 0;
            objArr3[7] = 0;
            if (!this.f52788p) {
                i2 = 0;
            }
            objArr3[8] = Integer.valueOf(i2);
            nVar3.mo160131h(14569, objArr3);
        } else {
            C115669n nVar4 = C115669n.INSTANCE;
            Object[] objArr4 = new Object[9];
            objArr4[0] = 0;
            objArr4[1] = 0;
            objArr4[2] = 0;
            objArr4[3] = 1;
            objArr4[4] = 0;
            objArr4[5] = 0;
            objArr4[6] = 0;
            objArr4[7] = 0;
            if (!this.f52788p) {
                i2 = 0;
            }
            objArr4[8] = Integer.valueOf(i2);
            nVar4.mo160131h(14569, objArr4);
        }
    }

    /* renamed from: T7 */
    public final void mo23801T7(String str, int i, int i2, int i3) {
        String format = String.format("%s,%d,%d,%d,%d", new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), 0});
        Log.m105927v("MicroMsg.FTS.FTSChattingConvUI", "reportClick: %s", format);
        C115669n.INSTANCE.kvStat(13234, format);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.asu;
    }

    public void initView() {
        super.initView();
        if (C72996z1.m85820U5(this.f52787o)) {
            C44661m1 SE = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69801SE(this.f52787o);
            this.f52791s = SE;
            if (SE.mo69790r2() != null) {
                this.f52792t = this.f52791s.mo69790r2().size();
            }
        }
        View findViewById = findViewById(C0966R.C0970id.j6s);
        this.f52789q = findViewById;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        RecyclerView recyclerView = (RecyclerView) findViewById(C0966R.C0970id.epk);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        recyclerView.mo17085h0(new C4404a(this));
        recyclerView.setAdapter(new C18830c(this));
    }

    /* renamed from: o6 */
    public void mo23749o6(View view, C22019b bVar, boolean z) {
        if (C72996z1.m85820U5(this.f52787o)) {
            mo23801T7(this.f52756j, 10, 5, bVar.f62324b + 1);
        } else {
            mo23801T7(this.f52756j, 11, 5, bVar.f62324b + 1);
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view instanceof TextView)) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f52790r = false;
        int intValue = ((Integer) view.getTag()).intValue();
        if (!C72996z1.m85820U5(this.f52787o)) {
            intValue++;
        }
        Bundle bundle = null;
        if (intValue == 0) {
            Log.m105924i("MicroMsg.FTS.FTSChattingConvUI", "onSearchMemberDetail");
            Intent intent = new Intent();
            intent.putExtra("from_scene", 1);
            intent.putExtra("RoomInfo_Id", this.f52787o);
            intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, getResources().getString(C0966R.string.ig7));
            C88144b.m109801s(this, "com.tencent.mm.chatroom.ui.SeeMemberRecordUI", intent, (Bundle) null);
        } else if (intValue == 1) {
            Log.m105924i("MicroMsg.FTS.FTSChattingConvUI", "onSearchDateDetail");
            Intent intent2 = new Intent();
            intent2.putExtra("detail_username", this.f52787o);
            C88144b.m109801s(this, "com.tencent.mm.chatroom.ui.SelectDateUI", intent2, (Bundle) null);
            mo23800S7(0);
        } else if (intValue == 2) {
            Log.m105924i("MicroMsg.FTS.FTSChattingConvUI", "onSeeImageVideoHistory");
            Intent intent3 = new Intent();
            intent3.putExtra("kintent_talker", this.f52787o);
            intent3.putExtra("key_media_type", 1);
            intent3.putExtra("key_gallery_enter_scene", 2);
            intent3.addFlags(67108864);
            C88144b.m109801s(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI", intent3, (Bundle) null);
            mo23800S7(1);
        } else if (intValue == 3) {
            Log.m105924i("MicroMsg.FTS.FTSChattingConvUI", "onSeeFileHistory");
            Intent intent4 = new Intent();
            intent4.putExtra("kintent_talker", this.f52787o);
            intent4.putExtra("key_media_type", 2);
            if (!C85875k4.m106211z()) {
                bundle = ActivityOptions.makeSceneTransitionAnimation(this, new Pair[0]).toBundle();
            }
            intent4.putExtra("detail_user_dismiss", this.f52788p);
            C88144b.m109801s(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent4, bundle);
        } else if (intValue == 4) {
            Log.m105924i("MicroMsg.FTS.FTSChattingConvUI", "onSeeUrlHistory");
            Intent intent5 = new Intent();
            intent5.putExtra("kintent_talker", this.f52787o);
            intent5.putExtra("key_media_type", 3);
            if (!C85875k4.m106211z()) {
                bundle = ActivityOptions.makeSceneTransitionAnimation(this, new Pair[0]).toBundle();
            }
            intent5.putExtra("detail_user_dismiss", this.f52788p);
            C88144b.m109801s(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent5, bundle);
        } else if (intValue == 5) {
            Log.m105924i("MicroMsg.FTS.FTSChattingConvUI", "onSeeUrlHistory");
            Intent intent6 = new Intent();
            intent6.putExtra("kintent_talker", this.f52787o);
            intent6.putExtra("key_media_type", 4);
            if (!C85875k4.m106211z()) {
                bundle = ActivityOptions.makeSceneTransitionAnimation(this, new Pair[0]).toBundle();
            }
            intent6.putExtra("detail_user_dismiss", this.f52788p);
            C88144b.m109801s(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent6, bundle);
        } else if (intValue == 6) {
            Log.m105924i("MicroMsg.FTS.FTSChattingConvUI", "onSeePayHistory");
            Intent intent7 = new Intent();
            intent7.putExtra("kintent_talker", this.f52787o);
            intent7.putExtra("key_media_type", 5);
            if (!C85875k4.m106211z()) {
                bundle = ActivityOptions.makeSceneTransitionAnimation(this, new Pair[0]).toBundle();
            }
            intent7.putExtra("detail_user_dismiss", this.f52788p);
            C88144b.m109801s(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent7, bundle);
        } else if (intValue == 7) {
            Log.m105924i("MicroMsg.FTS.FTSChattingConvUI", "onSeeAppBrandHistory");
            Intent intent8 = new Intent();
            intent8.putExtra("kintent_talker", this.f52787o);
            intent8.putExtra("key_media_type", 6);
            if (!C85875k4.m106211z()) {
                bundle = ActivityOptions.makeSceneTransitionAnimation(this, new Pair[0]).toBundle();
            }
            intent8.putExtra("detail_user_dismiss", this.f52788p);
            C88144b.m109801s(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent8, bundle);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
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
        int i;
        super.onDestroy();
        this.f52793u.mo23815g();
        C100558d Ta = ((C99260q) C86312j.m106911c(C99260q.class)).mo128746Ta();
        if (Ta != null) {
            ((C93829e) Ta).mo128780h();
        }
        if (this.f52790r && this.f52788p) {
            if (C72996z1.m85820U5(this.f52787o)) {
                C44661m1 SE = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69801SE(this.f52787o);
                if (SE.mo69790r2() != null) {
                    i = SE.mo69790r2().size();
                    C115669n.INSTANCE.mo160131h(14569, 1, 0, 0, 0, 0, 0, 0, Integer.valueOf(i), 2, 0, 99);
                }
            }
            i = 0;
            C115669n.INSTANCE.mo160131h(14569, 1, 0, 0, 0, 0, 0, 0, Integer.valueOf(i), 2, 0, 99);
        }
    }

    public void onResume() {
        super.onResume();
        this.f52789q.postDelayed(new C18829b(), 128);
    }
}
