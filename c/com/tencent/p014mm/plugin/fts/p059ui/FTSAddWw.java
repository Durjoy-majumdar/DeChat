package com.tencent.p014mm.plugin.fts.p059ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.OpenIMSearchFriendtLogStruct;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.fts.p059ui.widget.FTSLocalPageRelevantView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kv1.C99251g;
import kv1.C99252h;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import p148ei.C7660a;
import p196ln.C76705f;
import p239sv.C13784j;
import p239sv.C77792p;
import p823sg.C90193h;
import pv1.C22019b;
import qb0.C47798b;
import qb0.C77306a;
import qb0.C77307c;
import te3.C77917dy3;
import u73.C22613h1;
import u73.C52468u0;
import u73.C78137s0;
import xk0.C91263b;
import xv1.C23115a;
import zt3.C119157j;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.fts.ui.FTSAddWw */
public class FTSAddWw extends FTSBaseUI {

    /* renamed from: N */
    public static final /* synthetic */ int f52695N = 0;

    /* renamed from: A */
    public TextView f52696A;

    /* renamed from: B */
    public boolean f52697B;

    /* renamed from: C */
    public boolean f52698C;

    /* renamed from: D */
    public int f52699D = 1;

    /* renamed from: E */
    public FTSLocalPageRelevantView f52700E;

    /* renamed from: F */
    public String f52701F = "";

    /* renamed from: G */
    public C18846f f52702G;

    /* renamed from: H */
    public long f52703H;

    /* renamed from: I */
    public C77917dy3 f52704I;

    /* renamed from: J */
    public int f52705J;

    /* renamed from: K */
    public Dialog f52706K;

    /* renamed from: L */
    public int f52707L = -1;

    /* renamed from: M */
    public C77306a f52708M = new C18813d();

    /* renamed from: o */
    public String f52709o = "";

    /* renamed from: p */
    public View f52710p;

    /* renamed from: q */
    public View f52711q;

    /* renamed from: r */
    public View f52712r;

    /* renamed from: s */
    public View f52713s;

    /* renamed from: t */
    public View f52714t;

    /* renamed from: u */
    public View f52715u;

    /* renamed from: v */
    public View f52716v;

    /* renamed from: w */
    public ImageView f52717w;

    /* renamed from: x */
    public TextView f52718x;

    /* renamed from: y */
    public TextView f52719y;

    /* renamed from: z */
    public TextView f52720z;

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSAddWw$a */
    public class C18811a implements Runnable {
        public C18811a() {
        }

        public void run() {
            FTSAddWw.this.f52754h.getFtsEditText().mo70355k();
            FTSAddWw.this.f52754h.getFtsEditText().mo70361q();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSAddWw$c */
    public class C18812c implements MenuItem.OnMenuItemClickListener {
        public C18812c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            OpenIMSearchFriendtLogStruct openIMSearchFriendtLogStruct = new OpenIMSearchFriendtLogStruct();
            openIMSearchFriendtLogStruct.mo93196s(FTSAddWw.this.f52701F);
            openIMSearchFriendtLogStruct.f194309e = 2;
            openIMSearchFriendtLogStruct.mo86054n();
            FTSAddWw.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSAddWw$d */
    public class C18813d implements C77306a {
        public C18813d() {
        }

        public void onChanged(Object obj) {
            C77307c cVar = (C77307c) obj;
            if (cVar.f225433a == C47798b.OnEnd) {
                FTSAddWw fTSAddWw = FTSAddWw.this;
                int i = FTSAddWw.f52695N;
                fTSAddWw.getClass();
                MMHandlerThread.postToMainThread(new C18851l(fTSAddWw));
                int i2 = cVar.f225434b;
                if (i2 == 0 && cVar.f225435c == 0) {
                    FTSAddWw.this.f52704I = ((C13784j) cVar.f225437e).mo13144t();
                    FTSAddWw.this.f52705J = 1;
                    OpenIMSearchFriendtLogStruct openIMSearchFriendtLogStruct = new OpenIMSearchFriendtLogStruct();
                    openIMSearchFriendtLogStruct.mo93196s(FTSAddWw.this.f52701F);
                    openIMSearchFriendtLogStruct.f194309e = 0;
                    openIMSearchFriendtLogStruct.f194310f = 1;
                    openIMSearchFriendtLogStruct.mo86054n();
                } else {
                    int i3 = cVar.f225435c;
                    if (i3 == -24) {
                        C7660a a = C7660a.m7782a(cVar.f225436d);
                        if (a != null) {
                            FTSAddWw.this.f52720z.setText(a.f26001b);
                        } else {
                            FTSAddWw.this.f52720z.setText(C0966R.string.h9p);
                        }
                    } else if (i3 != -4) {
                        FTSAddWw.this.f52720z.setText(C0966R.string.h9p);
                    } else if (i2 == 4) {
                        FTSAddWw.this.f52720z.setText(C0966R.string.h9p);
                    } else {
                        FTSAddWw fTSAddWw2 = FTSAddWw.this;
                        fTSAddWw2.f52720z.setText(fTSAddWw2.getString(C0966R.string.igk));
                    }
                    FTSAddWw.this.f52705J = -1;
                    OpenIMSearchFriendtLogStruct openIMSearchFriendtLogStruct2 = new OpenIMSearchFriendtLogStruct();
                    openIMSearchFriendtLogStruct2.mo93196s(FTSAddWw.this.f52701F);
                    openIMSearchFriendtLogStruct2.f194309e = 0;
                    openIMSearchFriendtLogStruct2.f194310f = 2;
                    openIMSearchFriendtLogStruct2.mo86054n();
                }
                FTSAddWw fTSAddWw3 = FTSAddWw.this;
                if (fTSAddWw3.f52705J != 0) {
                    MMHandlerThread.postToMainThread(new C18851l(fTSAddWw3));
                    int i4 = fTSAddWw3.f52705J;
                    if (i4 > 0) {
                        fTSAddWw3.f52698C = true;
                        fTSAddWw3.mo23755T7();
                    } else if (i4 > 0) {
                        C77917dy3 dy32 = fTSAddWw3.f52704I;
                        String str = dy32.f227190d;
                        String str2 = dy32.f227191e;
                        fTSAddWw3.f52750d.setVisibility(8);
                        View view = fTSAddWw3.f52711q;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view2 = fTSAddWw3.f52712r;
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(0);
                        View view3 = view2;
                        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        fTSAddWw3.f52716v.setOnClickListener(new C18850k(fTSAddWw3));
                        fTSAddWw3.f52718x.setText(str2);
                        fTSAddWw3.f52719y.setText("");
                        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(fTSAddWw3.f52717w, str);
                        View view4 = fTSAddWw3.f52713s;
                        C9556a aVar3 = new C9556a();
                        aVar3.mo10233c(8);
                        View view5 = view4;
                        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view5, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view6 = fTSAddWw3.f52714t;
                        C9556a aVar4 = new C9556a();
                        aVar4.mo10233c(8);
                        View view7 = view6;
                        C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view7, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view8 = fTSAddWw3.f52715u;
                        C9556a aVar5 = new C9556a();
                        aVar5.mo10233c(8);
                        View view9 = view8;
                        C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                        C117292a.m165359e(view9, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        fTSAddWw3.f52700E.setVisibility(8);
                    } else {
                        fTSAddWw3.f52750d.setVisibility(8);
                        View view10 = fTSAddWw3.f52711q;
                        C9556a aVar6 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar6.mo10233c(0);
                        C117292a.m165358d(view10, aVar6.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view10.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                        C117292a.m165359e(view10, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view11 = fTSAddWw3.f52712r;
                        C9556a aVar7 = new C9556a();
                        aVar7.mo10233c(8);
                        View view12 = view11;
                        C117292a.m165358d(view12, aVar7.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view11.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                        C117292a.m165359e(view12, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view13 = fTSAddWw3.f52713s;
                        C9556a aVar8 = new C9556a();
                        aVar8.mo10233c(0);
                        C117292a.m165358d(view13, aVar8.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view13.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                        C117292a.m165359e(view13, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view14 = fTSAddWw3.f52714t;
                        C9556a aVar9 = new C9556a();
                        aVar9.mo10233c(8);
                        View view15 = view14;
                        C117292a.m165358d(view15, aVar9.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view14.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                        C117292a.m165359e(view15, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view16 = fTSAddWw3.f52715u;
                        C9556a aVar10 = new C9556a();
                        aVar10.mo10233c(8);
                        View view17 = view16;
                        C117292a.m165358d(view17, aVar10.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view16.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                        C117292a.m165359e(view17, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        fTSAddWw3.f52700E.setVisibility(8);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSAddWw$e */
    public class C18814e implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C13784j f52724d;

        public C18814e(C13784j jVar) {
            this.f52724d = jVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d((C117747y) this.f52724d);
            FTSAddWw.this.f52706K = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSAddWw$b */
    public class C18815b implements View.OnClickListener {
        public C18815b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fts/ui/FTSAddWw$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FTSAddWw.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/FTSAddWw$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public C18852m mo23744H7(C18854q qVar) {
        if (this.f52702G == null) {
            this.f52702G = new C18846f(qVar);
        }
        return this.f52702G;
    }

    /* renamed from: L7 */
    public void mo23753L7() {
        super.mo23753L7();
        setBackBtn(new C18812c());
    }

    /* renamed from: Q7 */
    public void mo23745Q7() {
        super.mo23745Q7();
        View view = this.f52711q;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "startSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "startSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: R7 */
    public void mo23746R7() {
        super.mo23746R7();
        OpenIMSearchFriendtLogStruct openIMSearchFriendtLogStruct = new OpenIMSearchFriendtLogStruct();
        openIMSearchFriendtLogStruct.mo93196s(this.f52701F);
        openIMSearchFriendtLogStruct.f194309e = 3;
        openIMSearchFriendtLogStruct.mo86054n();
        View view = this.f52711q;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "stopSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "stopSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: S7 */
    public final void mo23754S7(String str) {
        this.f52697B = true;
        this.f52698C = false;
        this.f52699D = 1;
        if (str != null && str.length() != 0 && str.trim().length() != 0) {
            this.f52707L = Character.isDigit(str.charAt(0)) ? 15 : 3;
            this.f52705J = 0;
            C13784j Zf = ((C77792p) C86312j.m106911c(C77792p.class)).mo107736Zf(str, 1);
            C86709a0.m107524d().mo123460f((C117747y) Zf);
            this.f52706K = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.igj), true, true, new C18814e(Zf));
        }
    }

    /* renamed from: T7 */
    public final void mo23755T7() {
        String str = this.f52704I.f227190d;
        if (Util.nullAsNil(str).length() > 0) {
            int i = this.f52704I.f227198o;
            if (2 == i) {
                this.f52707L = 15;
            } else if (1 == i) {
                this.f52707L = 1;
            }
            Intent intent = new Intent();
            intent.putExtra("Contact_User", str);
            intent.putExtra("AntispamTicket", this.f52704I.f227200q);
            if (this.f52707L == 15 && 2 == this.f52704I.f227198o) {
                intent.putExtra("Contact_Search_Mobile", this.f52709o.trim());
            }
            if (Util.isNullOrNil(this.f52704I.f227201r)) {
                Log.m105924i("MicroMsg.FTS.FTSAddFriendUI", "FinderUsername is empty");
            } else {
                Log.m105924i("MicroMsg.FTS.FTSAddFriendUI", "FinderUsername is " + this.f52704I.f227201r);
            }
            intent.putExtra("key_add_contact_openim_appid", this.f52704I.f227197n);
            intent.putExtra("key_add_contact_openim_finder_username", this.f52704I.f227201r);
            intent.putExtra("Contact_Nick", this.f52704I.f227191e);
            intent.putExtra("Contact_PyInitial", this.f52704I.f227192f);
            intent.putExtra("Contact_QuanPin", this.f52704I.f227193g);
            intent.putExtra("Contact_Sex", this.f52704I.f227194h);
            intent.putExtra("key_add_contact_custom_detail_visible", this.f52704I.f227199p.f130995d);
            intent.putExtra("key_add_contact_custom_detail", this.f52704I.f227199p.f130996e);
            intent.putExtra("Contact_Scene", this.f52707L);
            intent.putExtra("key_ww_add_session_id", this.f52701F);
            intent.putExtra("add_more_friend_search_scene", 2);
            C88144b.m109791i(this, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        }
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        super.mo3001b3(str, str2, list, mVar);
        this.f52697B = false;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.asp;
    }

    /* renamed from: o6 */
    public void mo23749o6(View view, C22019b bVar, boolean z) {
        if ((bVar instanceof C23115a) && System.currentTimeMillis() - this.f52703H > 1000) {
            this.f52703H = System.currentTimeMillis();
            this.f52709o = bVar.mo35139k();
            mo23754S7(bVar.mo35139k());
            OpenIMSearchFriendtLogStruct openIMSearchFriendtLogStruct = new OpenIMSearchFriendtLogStruct();
            openIMSearchFriendtLogStruct.mo93196s(this.f52701F);
            openIMSearchFriendtLogStruct.f194309e = 1;
            openIMSearchFriendtLogStruct.mo86054n();
        }
    }

    public void onBackPressed() {
        OpenIMSearchFriendtLogStruct openIMSearchFriendtLogStruct = new OpenIMSearchFriendtLogStruct();
        openIMSearchFriendtLogStruct.mo93196s(this.f52701F);
        openIMSearchFriendtLogStruct.f194309e = 2;
        openIMSearchFriendtLogStruct.mo86054n();
        finish();
    }

    public void onClickBackBtn(View view) {
        super.onClickBackBtn(view);
        OpenIMSearchFriendtLogStruct openIMSearchFriendtLogStruct = new OpenIMSearchFriendtLogStruct();
        openIMSearchFriendtLogStruct.mo93196s(this.f52701F);
        openIMSearchFriendtLogStruct.f194309e = 2;
        openIMSearchFriendtLogStruct.mo86054n();
    }

    public void onClickClearTextBtn(View view) {
        super.onClickClearTextBtn(view);
        if (!this.f52754h.getFtsEditText().mo70354j()) {
            this.f52754h.getFtsEditText().mo70355k();
            showVKB();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f52701F = C90193h.m112878f((System.currentTimeMillis() + "").getBytes());
        C99252h.f291030c = C99251g.m129286g(16);
        Transition inflateTransition = TransitionInflater.from(this).inflateTransition(17760258);
        inflateTransition.excludeTarget(getWindow().getDecorView().findViewById(C0966R.C0970id.f5383do), true);
        inflateTransition.excludeTarget(16908335, true);
        getWindow().setEnterTransition(inflateTransition);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.a7_));
        hideActionbarLine();
        this.f52755i = getContext().getResources().getString(C0966R.string.bui);
        this.f52754h.getFtsEditText().setHint(mo23781J7());
        this.f52710p = findViewById(C0966R.C0970id.a8k);
        this.f52711q = findViewById(C0966R.C0970id.bmj);
        this.f52712r = findViewById(C0966R.C0970id.etj);
        this.f52716v = findViewById(C0966R.C0970id.bmk);
        this.f52713s = findViewById(C0966R.C0970id.hge);
        this.f52714t = findViewById(C0966R.C0970id.gsv);
        this.f52715u = findViewById(C0966R.C0970id.j5_);
        this.f52700E = (FTSLocalPageRelevantView) findViewById(C0966R.C0970id.ikr);
        this.f52717w = (ImageView) findViewById(C0966R.C0970id.bm_);
        this.f52718x = (TextView) findViewById(C0966R.C0970id.bqi);
        this.f52719y = (TextView) findViewById(C0966R.C0970id.bmo);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f359142j73);
        this.f52720z = (TextView) findViewById(C0966R.C0970id.bmp);
        this.f52696A = (TextView) findViewById(C0966R.C0970id.j5b);
        try {
            String optString = C78137s0.m94340d("webSearchBar").optString("wording");
            Log.m105925i("MicroMsg.FTS.FTSAddFriendUI", "set searchNetworkTips %s", optString);
            this.f52696A.setText(optString);
        } catch (Exception unused) {
        }
        getContentView().postDelayed(new C18811a(), 128);
        this.f52710p.setOnClickListener(new C18815b());
        C86709a0.m107524d().mo123468n(C91263b.CTRL_INDEX, this, this.f52708M);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f52697B && !this.f52698C) {
            C22613h1.m26478d(this.f52756j, this.f52699D, 3, 16);
        }
    }

    public void onResume() {
        super.onResume();
        ((C119157j) C119157j.f356862d).mo183879j(new C52468u0(true, false), 0, "WebSearchThread");
    }

    /* renamed from: y */
    public boolean mo3009y() {
        mo23754S7(this.f52756j);
        hideVKB();
        return true;
    }
}
