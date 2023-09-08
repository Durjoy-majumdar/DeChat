package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import c02.C92331c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.fav.p047ui.C93594f1;
import com.tencent.p014mm.plugin.fav.p047ui.C93604g1;
import com.tencent.p014mm.plugin.handoff.model.AbsHandOffFile;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import java.util.LinkedList;
import ke3.C88144b;
import nc1.C100111a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import p159gw.C98250h;
import pb1.C100695a0;
import pb1.C100734q;
import pb1.C100743s1;
import pb1.C100755z;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.g */
public class C93562g implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f270216d;

    /* renamed from: e */
    public final /* synthetic */ boolean f270217e;

    /* renamed from: f */
    public final /* synthetic */ int f270218f;

    /* renamed from: g */
    public final /* synthetic */ FavoriteFileDetailUI f270219g;

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.g$a */
    public class C93563a implements C11182m0 {
        public C93563a() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            C93562g gVar = C93562g.this;
            if (gVar.f270216d) {
                FavoriteFileDetailUI favoriteFileDetailUI = gVar.f270219g;
                if (!favoriteFileDetailUI.f270043D.mo140133b(favoriteFileDetailUI.f270042C)) {
                    C93562g gVar2 = C93562g.this;
                    FavoriteFileDetailUI favoriteFileDetailUI2 = gVar2.f270219g;
                    if (favoriteFileDetailUI2.f270042C.f299322q1 == 0) {
                        int i = gVar2.f270218f;
                        if (i == 8) {
                            e0Var.mo107142f(0, favoriteFileDetailUI2.getString(C0966R.string.crb));
                            C100111a aVar = C93562g.this.f270219g.f270055Q;
                            if (aVar != null) {
                                aVar.getClass();
                                e0Var.mo107142f(5, C93562g.this.f270219g.getString(C0966R.string.cak));
                            }
                            String o = C86013q1.m106454o(C100734q.m131880w(C93562g.this.f270219g.f270042C));
                            if (((C92331c) C86312j.m106911c(C92331c.class)).mo58357LH() && C93562g.this.f270219g.f270053N != null && AbsHandOffFile.isSupportOpenFile(o)) {
                                e0Var.mo107142f(6, C93562g.this.f270219g.getString(C0966R.string.cvp));
                            }
                        } else if (i == 15) {
                            e0Var.mo107142f(0, favoriteFileDetailUI2.getString(C0966R.string.crb));
                            e0Var.mo107142f(4, C93562g.this.f270219g.getString(C0966R.string.iar));
                        } else if (i == 4) {
                            e0Var.mo107142f(0, favoriteFileDetailUI2.getString(C0966R.string.crb));
                            e0Var.mo107142f(4, C93562g.this.f270219g.getString(C0966R.string.iar));
                        } else {
                            e0Var.mo107142f(0, favoriteFileDetailUI2.getString(C0966R.string.crb));
                            C93562g gVar3 = C93562g.this;
                            if (gVar3.f270217e && gVar3.f270219g.f270041B.mo140185n2()) {
                                e0Var.mo107142f(1, C93562g.this.f270219g.getString(C0966R.string.cpw));
                            }
                        }
                    }
                }
            }
            C93562g gVar4 = C93562g.this;
            if (gVar4.f270217e) {
                e0Var.mo107142f(3, gVar4.f270219g.getString(C0966R.string.cnr));
                e0Var.mo107142f(2, C93562g.this.f270219g.getContext().getString(C0966R.string.f7944x1));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.g$b */
    public class C93564b implements C11184p0 {

        /* renamed from: com.tencent.mm.plugin.fav.ui.detail.g$b$a */
        public class C93565a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Dialog f270222d;

            public C93565a(C93564b bVar, Dialog dialog) {
                this.f270222d = dialog;
            }

            public void run() {
                this.f270222d.dismiss();
            }
        }

        /* renamed from: com.tencent.mm.plugin.fav.ui.detail.g$b$b */
        public class C93566b implements DialogInterface.OnClickListener {

            /* renamed from: com.tencent.mm.plugin.fav.ui.detail.g$b$b$a */
            public class C93567a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C89779i0 f270224d;

                public C93567a(C89779i0 i0Var) {
                    this.f270224d = i0Var;
                }

                public void run() {
                    C93562g.this.f270219g.f270015g.f295031p = true;
                    this.f270224d.dismiss();
                    Log.m105919d("MicroMsg.FavoriteFileDetailUI", "do del fav file, local id %d, fav id %d", Long.valueOf(C93562g.this.f270219g.f270041B.field_localId), Integer.valueOf(C93562g.this.f270219g.f270041B.field_id));
                    C93562g.this.f270219g.finish();
                }
            }

            public C93566b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C100734q.m131856k(C93562g.this.f270219g.f270041B.field_localId, new C93567a(C76879j.m92723Q(C93562g.this.f270219g.getContext(), "", C93562g.this.f270219g.getString(C0966R.string.f7946x3), false, false, (DialogInterface.OnCancelListener) null)), 15);
            }
        }

        public C93564b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int i2;
            C86001b0 q;
            switch (menuItem.getItemId()) {
                case 0:
                    FavoriteFileDetailUI favoriteFileDetailUI = C93562g.this.f270219g;
                    int i3 = FavoriteFileDetailUI.f270039Y;
                    if (favoriteFileDetailUI.mo128407L7() == 8) {
                        String w = C100734q.m131880w(C93562g.this.f270219g.f270042C);
                        if (!C86013q1.m106450k(w)) {
                            Log.m105920e("MicroMsg.FavoriteFileDetailUI", "share file failed, file not exists");
                            FavoriteFileDetailUI favoriteFileDetailUI2 = C93562g.this.f270219g;
                            Toast.makeText(favoriteFileDetailUI2, favoriteFileDetailUI2.getString(C0966R.string.cr_), 1).show();
                            return;
                        }
                        Uri n = C116299g2.m163858n(w);
                        String path = n.getPath();
                        if (path != null) {
                            String k = C116299g2.m163855k(path, false, false);
                            if (!n.getPath().equals(k)) {
                                n = n.buildUpon().path(k).build();
                            }
                        }
                        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                        long j = 0;
                        if (l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null) {
                            j = q.f250473c;
                        }
                        if (j > FavoriteFileDetailUI.f270038X) {
                            Log.m105920e("MicroMsg.FavoriteFileDetailUI", "share file failed, file too large");
                            FavoriteFileDetailUI favoriteFileDetailUI3 = C93562g.this.f270219g;
                            Toast.makeText(favoriteFileDetailUI3, favoriteFileDetailUI3.getString(C0966R.string.cra), 1).show();
                            return;
                        }
                    }
                    FavoriteFileDetailUI favoriteFileDetailUI4 = C93562g.this.f270219g;
                    favoriteFileDetailUI4.f270015g.f295027l++;
                    C100755z zVar = favoriteFileDetailUI4.f270041B;
                    favoriteFileDetailUI4.getClass();
                    C100695a0.m131729d(zVar.field_localId, 1, 0, -1);
                    Intent intent = new Intent();
                    intent.putExtra("Select_Conv_Type", 3);
                    intent.putExtra("select_is_ret", true);
                    intent.putExtra("mutil_select_is_ret", true);
                    if (favoriteFileDetailUI4.mo128407L7() == 15) {
                        i2 = 11;
                        intent.putExtra("image_path", C93594f1.m118176d(favoriteFileDetailUI4.f270042C));
                    } else if (favoriteFileDetailUI4.mo128407L7() == 4) {
                        intent.putExtra("image_path", C93594f1.m118176d(favoriteFileDetailUI4.f270042C));
                        i2 = 1;
                    } else {
                        intent.putExtra("desc_title", favoriteFileDetailUI4.f270042C.f299297d);
                        i2 = 3;
                    }
                    intent.putExtra("Retr_Msg_Type", i2);
                    C88144b.m109802t(favoriteFileDetailUI4, ".ui.transmit.SelectConversationUI", intent, 1);
                    C93562g.this.f270219g.mo128401H7(3);
                    return;
                case 1:
                    FavoriteFileDetailUI favoriteFileDetailUI5 = C93562g.this.f270219g;
                    favoriteFileDetailUI5.f270015g.f295028m++;
                    C89779i0 Q = C76879j.m92723Q(favoriteFileDetailUI5.getContext(), "", C93562g.this.f270219g.getString(C0966R.string.col), true, false, (DialogInterface.OnCancelListener) null);
                    MMActivity K7 = C93562g.this.f270219g.getContext();
                    C100755z zVar2 = C93562g.this.f270219g.f270041B;
                    C93565a aVar = new C93565a(this, Q);
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(Integer.valueOf(zVar2.field_id));
                    C86709a0.m107524d().mo123460f(new C100743s1("", 2, linkedList, new C93604g1(zVar2, K7, aVar), zVar2.field_type));
                    C93562g.this.f270219g.mo128401H7(4);
                    return;
                case 2:
                    C76879j.m92750u(C93562g.this.f270219g.getContext(), C93562g.this.f270219g.getString(C0966R.string.f7946x3), "", new C93566b(), (DialogInterface.OnClickListener) null);
                    C93562g.this.f270219g.mo128401H7(6);
                    return;
                case 3:
                    C93562g.this.f270219g.f270015g.f295030o++;
                    Intent intent2 = new Intent();
                    intent2.putExtra("key_fav_scene", 2);
                    intent2.putExtra("key_fav_item_id", C93562g.this.f270219g.f270041B.field_localId);
                    C100734q.m131875t0(C93562g.this.f270219g.getContext(), ".ui.FavTagEditUI", intent2, (Bundle) null);
                    C93562g.this.f270219g.mo128401H7(7);
                    return;
                case 4:
                    FavoriteFileDetailUI favoriteFileDetailUI6 = C93562g.this.f270219g;
                    String w2 = C100734q.m131880w(favoriteFileDetailUI6.f270042C);
                    ((C98250h) C86312j.m106911c(C98250h.class)).mo137342Lm(favoriteFileDetailUI6.getContext(), w2, new C93561f(favoriteFileDetailUI6, w2));
                    C93562g.this.f270219g.mo128401H7(5);
                    return;
                case 5:
                    C100111a aVar2 = C93562g.this.f270219g.f270055Q;
                    if (aVar2 != null) {
                        aVar2.mo124068H(true, 1);
                        return;
                    }
                    return;
                case 6:
                    if (C93562g.this.f270219g.f270053N != null) {
                        ((C92331c) C86312j.m106911c(C92331c.class)).k00(C93562g.this.f270219g.f270053N);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public C93562g(FavoriteFileDetailUI favoriteFileDetailUI, boolean z, boolean z2, int i) {
        this.f270219g = favoriteFileDetailUI;
        this.f270216d = z;
        this.f270217e = z2;
        this.f270218f = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r3.f270219g.f270042C.f299322q1 == 0) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onMenuItemClick(android.view.MenuItem r4) {
        /*
            r3 = this;
            boolean r4 = r3.f270216d
            r0 = 0
            if (r4 == 0) goto L_0x0019
            com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI r4 = r3.f270219g
            pb1.e0 r1 = r4.f270043D
            te3.rc0 r4 = r4.f270042C
            boolean r4 = r1.mo140133b(r4)
            if (r4 != 0) goto L_0x0019
            com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI r4 = r3.f270219g
            te3.rc0 r4 = r4.f270042C
            int r4 = r4.f299322q1
            if (r4 == 0) goto L_0x001e
        L_0x0019:
            boolean r4 = r3.f270217e
            if (r4 != 0) goto L_0x001e
            return r0
        L_0x001e:
            qo3.n r4 = new qo3.n
            com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI r1 = r3.f270219g
            com.tencent.mm.ui.MMActivity r1 = r1.getContext()
            r2 = 1
            r4.<init>((android.content.Context) r1, (int) r2, (boolean) r0)
            com.tencent.mm.plugin.fav.ui.detail.g$a r0 = new com.tencent.mm.plugin.fav.ui.detail.g$a
            r0.<init>()
            r4.f225771i = r0
            com.tencent.mm.plugin.fav.ui.detail.g$b r0 = new com.tencent.mm.plugin.fav.ui.detail.g$b
            r0.<init>()
            r4.f225782p = r0
            r4.mo107573q()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.detail.C93562g.onMenuItemClick(android.view.MenuItem):boolean");
    }
}
