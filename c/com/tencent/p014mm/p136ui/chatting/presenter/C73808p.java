package com.tencent.p014mm.p136ui.chatting.presenter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74310y2;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.plugin.fav.p047ui.C68924p1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import dk3.C75414f;
import eb0.C97625j3;
import f40.C86709a0;
import kg3.C76577a;
import nj3.C11184p0;
import p158gt.C98201k;
import p763ym.C79138l;
import qo3.C77407n;
import rk3.C63462a;
import uj3.C78211g;

/* renamed from: com.tencent.mm.ui.chatting.presenter.p */
public class C73808p extends C73787b {

    /* renamed from: p */
    public int f216608p = -1;

    /* renamed from: com.tencent.mm.ui.chatting.presenter.p$a */
    public class C73809a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f216609d;

        /* renamed from: com.tencent.mm.ui.chatting.presenter.p$a$a */
        public class C73810a implements Runnable {
            public C73810a() {
            }

            public void run() {
                C73809a aVar = C73809a.this;
                C73808p pVar = C73808p.this;
                C75414f fVar = pVar.f216569f;
                if (fVar != null) {
                    fVar.mo102730k(aVar.f216609d, pVar.f216572i.size());
                }
            }
        }

        public C73809a(boolean z) {
            this.f216609d = z;
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: type inference failed for: r4v1 */
        /* JADX WARNING: type inference failed for: r4v2, types: [eb0.w2$a, java.lang.String] */
        /* JADX WARNING: type inference failed for: r4v3 */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0075 A[Catch:{ all -> 0x015a }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0129 A[Catch:{ all -> 0x015a }] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x013b A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r25 = this;
                r1 = r25
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                eb0.c r2 = eb0.C97625j3.m125812b()
                g62.l r2 = r2.mo105911z()
                com.tencent.mm.ui.chatting.presenter.p r3 = com.tencent.p014mm.p136ui.chatting.presenter.C73808p.this
                java.lang.String r4 = r3.f216568e
                int r3 = r3.f216608p
                com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
                r5 = 0
                android.database.Cursor r2 = r2.mo101073LL(r4, r5, r3)
                if (r2 != 0) goto L_0x0026
                java.lang.String r0 = "MicroMsg.MusicHistoryListPresenter"
                java.lang.String r2 = "[loadData] cursor is null!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
                return
            L_0x0026:
                com.tencent.mm.ui.chatting.presenter.p r3 = com.tencent.p014mm.p136ui.chatting.presenter.C73808p.this
                java.lang.String r3 = r3.f216568e
                boolean r3 = com.tencent.p014mm.storage.C72996z1.m85820U5(r3)
                r4 = 0
                if (r3 == 0) goto L_0x0044
                eb0.c r3 = eb0.C97625j3.m125812b()
                eb0.m2 r3 = r3.mo105902q()
                com.tencent.mm.ui.chatting.presenter.p r6 = com.tencent.p014mm.p136ui.chatting.presenter.C73808p.this
                java.lang.String r6 = r6.f216568e
                com.tencent.mm.storage.n1 r3 = (com.tencent.p014mm.storage.C44662n1) r3
                com.tencent.mm.storage.m1 r3 = r3.mo69799Lo(r6)
                goto L_0x0045
            L_0x0044:
                r3 = r4
            L_0x0045:
                r6 = 0
            L_0x0047:
                boolean r8 = r2.moveToNext()     // Catch:{ all -> 0x015a }
                if (r8 == 0) goto L_0x013e
                com.tencent.mm.storage.f4 r8 = new com.tencent.mm.storage.f4     // Catch:{ all -> 0x015a }
                r8.<init>()     // Catch:{ all -> 0x015a }
                r8.convertFrom(r2)     // Catch:{ all -> 0x015a }
                java.lang.String r9 = r8.getContent()     // Catch:{ all -> 0x015a }
                if (r9 == 0) goto L_0x013b
                com.tencent.mm.message.l$b r9 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r9, r4)     // Catch:{ all -> 0x015a }
                if (r9 == 0) goto L_0x013b
                com.tencent.mm.ui.chatting.presenter.p r10 = com.tencent.p014mm.p136ui.chatting.presenter.C73808p.this     // Catch:{ all -> 0x015a }
                int r11 = r9.f195582i     // Catch:{ all -> 0x015a }
                r10.getClass()     // Catch:{ all -> 0x015a }
                r10 = 3
                if (r10 == r11) goto L_0x0072
                r10 = 76
                if (r11 != r10) goto L_0x0070
                goto L_0x0072
            L_0x0070:
                r10 = 0
                goto L_0x0073
            L_0x0072:
                r10 = 1
            L_0x0073:
                if (r10 == 0) goto L_0x013b
                java.util.Date r10 = new java.util.Date     // Catch:{ all -> 0x015a }
                long r11 = r8.getCreateTime()     // Catch:{ all -> 0x015a }
                r10.<init>(r11)     // Catch:{ all -> 0x015a }
                com.tencent.mm.ui.gridviewheaders.a r11 = com.tencent.p014mm.p136ui.gridviewheaders.C74763a.m89510e()     // Catch:{ all -> 0x015a }
                long r10 = r11.mo103933a(r10)     // Catch:{ all -> 0x015a }
                int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r12 == 0) goto L_0x009b
                uj3.g$d r6 = new uj3.g$d     // Catch:{ all -> 0x015a }
                long r12 = r8.getCreateTime()     // Catch:{ all -> 0x015a }
                r6.<init>(r12)     // Catch:{ all -> 0x015a }
                r0.add(r6)     // Catch:{ all -> 0x015a }
                com.tencent.mm.ui.chatting.presenter.p r6 = com.tencent.p014mm.p136ui.chatting.presenter.C73808p.this     // Catch:{ all -> 0x015a }
                r6.getClass()     // Catch:{ all -> 0x015a }
            L_0x009b:
                com.tencent.mm.ui.chatting.presenter.p r6 = com.tencent.p014mm.p136ui.chatting.presenter.C73808p.this     // Catch:{ all -> 0x015a }
                java.lang.String r7 = r6.f216568e     // Catch:{ all -> 0x015a }
                boolean r7 = com.tencent.p014mm.storage.C72996z1.m85820U5(r7)     // Catch:{ all -> 0x015a }
                java.lang.String r6 = r6.mo102843r(r8, r7, r5)     // Catch:{ all -> 0x015a }
                java.lang.Class<f62.k0> r7 = f62.C75700k0.class
                k40.a r7 = f40.C86709a0.m107533q(r7)     // Catch:{ all -> 0x015a }
                f62.k0 r7 = (f62.C75700k0) r7     // Catch:{ all -> 0x015a }
                com.tencent.mm.storage.u3 r7 = r7.mo96097Ni()     // Catch:{ all -> 0x015a }
                com.tencent.mm.storage.z1 r7 = r7.get(r6)     // Catch:{ all -> 0x015a }
                java.lang.String r12 = ""
                if (r3 == 0) goto L_0x00c2
                java.lang.String r6 = r3.mo69789q2(r6)     // Catch:{ all -> 0x015a }
                r24 = r6
                goto L_0x00c4
            L_0x00c2:
                r24 = r12
            L_0x00c4:
                java.lang.String r6 = r9.f195602n     // Catch:{ all -> 0x015a }
                com.tencent.p014mm.plugin.fav.p047ui.C93693r.m118403d(r6)     // Catch:{ all -> 0x015a }
                com.tencent.mm.ui.chatting.presenter.p r6 = com.tencent.p014mm.p136ui.chatting.presenter.C73808p.this     // Catch:{ all -> 0x015a }
                android.content.Context r6 = r6.f216567d     // Catch:{ all -> 0x015a }
                java.lang.String r13 = r9.f195634v     // Catch:{ all -> 0x015a }
                java.lang.String r6 = pb1.C100734q.m131876u(r6, r13)     // Catch:{ all -> 0x015a }
                eb0.c r13 = eb0.C97625j3.m125812b()     // Catch:{ all -> 0x015a }
                com.tencent.mm.storage.u3 r13 = r13.mo105907v()     // Catch:{ all -> 0x015a }
                java.lang.String r14 = r9.f195634v     // Catch:{ all -> 0x015a }
                com.tencent.mm.storage.z1 r13 = r13.get(r14)     // Catch:{ all -> 0x015a }
                if (r13 == 0) goto L_0x00f5
                java.lang.String r14 = r13.getUsername()     // Catch:{ all -> 0x015a }
                java.lang.String r15 = r9.f195634v     // Catch:{ all -> 0x015a }
                boolean r14 = r14.equals(r15)     // Catch:{ all -> 0x015a }
                if (r14 != 0) goto L_0x00f0
                goto L_0x00f5
            L_0x00f0:
                java.lang.String r6 = r13.mo62898f()     // Catch:{ all -> 0x015a }
                goto L_0x00fe
            L_0x00f5:
                eb0.w2 r13 = eb0.C31519v2.m39436a()     // Catch:{ all -> 0x015a }
                java.lang.String r14 = r9.f195634v     // Catch:{ all -> 0x015a }
                r13.mo55988e(r14, r12, r4)     // Catch:{ all -> 0x015a }
            L_0x00fe:
                com.tencent.mm.ui.chatting.presenter.p$c r12 = new com.tencent.mm.ui.chatting.presenter.p$c     // Catch:{ all -> 0x015a }
                com.tencent.mm.ui.chatting.presenter.p r14 = com.tencent.p014mm.p136ui.chatting.presenter.C73808p.this     // Catch:{ all -> 0x015a }
                long r15 = r8.getCreateTime()     // Catch:{ all -> 0x015a }
                int r13 = r9.f195582i     // Catch:{ all -> 0x015a }
                java.lang.String r4 = r9.f195570f     // Catch:{ all -> 0x015a }
                long r19 = r8.getMsgId()     // Catch:{ all -> 0x015a }
                java.lang.String r21 = r7.getUsername()     // Catch:{ all -> 0x015a }
                java.lang.String r22 = r7.mo62909j3()     // Catch:{ all -> 0x015a }
                java.lang.String r23 = r7.mo73969n2()     // Catch:{ all -> 0x015a }
                r7 = r13
                r13 = r12
                r17 = r7
                r18 = r4
                r13.<init>(r14, r15, r17, r18, r19, r21, r22, r23, r24)     // Catch:{ all -> 0x015a }
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ all -> 0x015a }
                if (r4 == 0) goto L_0x012b
                java.lang.String r6 = r9.f195574g     // Catch:{ all -> 0x015a }
            L_0x012b:
                r12.f216616k = r6     // Catch:{ all -> 0x015a }
                java.lang.String r4 = r9.f195562d     // Catch:{ all -> 0x015a }
                r12.f216615j = r4     // Catch:{ all -> 0x015a }
                java.lang.String r4 = r8.mo108765s2()     // Catch:{ all -> 0x015a }
                r12.f216617l = r4     // Catch:{ all -> 0x015a }
                r0.add(r12)     // Catch:{ all -> 0x015a }
                r6 = r10
            L_0x013b:
                r4 = 0
                goto L_0x0047
            L_0x013e:
                r2.close()
                com.tencent.mm.ui.chatting.presenter.p r2 = com.tencent.p014mm.p136ui.chatting.presenter.C73808p.this
                java.util.ArrayList<uj3.g$c> r2 = r2.f216572i
                r2.addAll(r0)
                com.tencent.mm.ui.chatting.presenter.p r2 = com.tencent.p014mm.p136ui.chatting.presenter.C73808p.this
                java.util.ArrayList<uj3.g$c> r3 = r2.f216572i
                r2.f216573j = r3
                r0.clear()
                com.tencent.mm.ui.chatting.presenter.p$a$a r0 = new com.tencent.mm.ui.chatting.presenter.p$a$a
                r0.<init>()
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
                return
            L_0x015a:
                r0 = move-exception
                r2.close()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.presenter.C73808p.C73809a.run():void");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.p$b */
    public class C73811b implements C78211g.C78219f {

        /* renamed from: com.tencent.mm.ui.chatting.presenter.p$b$a */
        public class C73812a implements View.OnCreateContextMenuListener {
            public C73812a(C73811b bVar) {
            }

            public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                contextMenu.add(0, 0, 0, view.getContext().getString(C0966R.string.i4e));
                contextMenu.add(0, 1, 0, view.getContext().getString(C0966R.string.b7o));
                contextMenu.add(0, 2, 0, view.getContext().getString(C0966R.string.n3j));
                contextMenu.add(0, 3, 0, view.getContext().getString(C0966R.string.b_1));
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.presenter.p$b$b */
        public class C73813b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ C78211g.C78216c f216613d;

            public C73813b(C78211g.C78216c cVar) {
                this.f216613d = cVar;
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                C73808p.this.mo102845t(menuItem.getItemId(), ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f216613d.f229172d), 3);
            }
        }

        public C73811b() {
        }

        /* renamed from: a */
        public void mo102833a(View view, int i, C78211g.C78216c cVar) {
            Log.m105925i("MicroMsg.MusicHistoryListPresenter", "[onItemLongClick] position:%s", Integer.valueOf(i));
            C63462a.f180011a.mo88333h(14, 3);
            new C45082x0(view.getContext()).mo70436b(view, new C73812a(this), new C73813b(cVar), (C77407n.C47880p) null);
        }

        /* renamed from: b */
        public void mo102834b(View view, int i, C78211g.C78216c cVar) {
            if (WeChatBrands.Business.Entries.SessionMusic.checkAvailable(view.getContext())) {
                C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(cVar.f229172d);
                C74310y2.m88648c(C68070l.C68072b.m80422u(b002.getContent(), (String) null), C73808p.this.f216567d, "", b002);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.p$c */
    public class C73814c extends C78211g.C78216c {

        /* renamed from: j */
        public String f216615j;

        /* renamed from: k */
        public String f216616k;

        /* renamed from: l */
        public String f216617l;

        public C73814c(C73808p pVar, long j, int i, String str, long j2, String str2, String str3, String str4, String str5) {
            super(j, i, str, j2, str2, str3, str4, str5);
        }

        /* renamed from: a */
        public int mo102836a() {
            return 3;
        }

        /* renamed from: d */
        public boolean mo102837d(String str) {
            if (str == null) {
                return false;
            }
            String lowerCase = str.toLowerCase();
            if (!mo108239b(lowerCase)) {
                if (!Util.isNullOrNil(this.f216616k) && mo108240c(lowerCase, this.f216616k.toLowerCase())) {
                    return true;
                }
            } else if (!Util.isNullOrNil(this.f216616k) && this.f216616k.toLowerCase().contains(lowerCase)) {
                return true;
            }
            return super.mo102837d(lowerCase);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.p$d */
    public class C73815d extends C78211g.C78213b {

        /* renamed from: E */
        public ImageView f216618E;

        /* renamed from: F */
        public TextView f216619F;

        /* renamed from: G */
        public ImageView f216620G;

        public C73815d(C73808p pVar, View view) {
            super(view);
            this.f216618E = (ImageView) view.findViewById(C0966R.C0970id.cv_);
            ((TextView) view.findViewById(C0966R.C0970id.cuv)).setVisibility(8);
            this.f216619F = (TextView) view.findViewById(C0966R.C0970id.cw9);
            ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.cve);
            this.f216620G = imageView;
            imageView.setImageResource(C0966R.C0969drawable.ajs);
            this.f216620G.setVisibility(0);
        }
    }

    public C73808p(Context context) {
        super(context);
    }

    /* renamed from: c */
    public String mo102824c() {
        return this.f216567d.getString(C0966R.string.f7550jd);
    }

    /* renamed from: e */
    public String mo102825e() {
        return this.f216567d.getString(C0966R.string.f7550jd);
    }

    /* renamed from: f */
    public void mo102826f(C78211g.C78213b bVar, int i, int i2) {
        C73815d dVar = (C73815d) bVar;
        C73814c cVar = (C73814c) mo102842q(i);
        dVar.f229165B.setText(C68924p1.m81173b(this.f216567d, cVar.f229169a));
        Bitmap jo = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).mo127188jo(cVar.f216617l, C76577a.m92156g(this.f216567d), false);
        if (jo == null || jo.isRecycled()) {
            Bitmap ub = ((C79138l) C86312j.m106911c(C79138l.class)).mo74018ub(cVar.f216615j, 1, C76577a.m92156g(this.f216567d));
            if (ub == null || ub.isRecycled()) {
                dVar.f216618E.setImageResource(C0966R.raw.app_attach_file_icon_webpage);
            } else {
                dVar.f216618E.setImageBitmap(ub);
            }
        } else {
            dVar.f216618E.setImageBitmap(jo);
        }
        dVar.f216619F.setText(Util.nullAs(cVar.f216616k, ""));
        dVar.mo108236y(dVar.f216619F, this.f216570g.f229163e);
    }

    /* renamed from: g */
    public void mo102827g(boolean z) {
        this.f216569f.mo102729f(z);
        C86709a0.m107528h();
        C86709a0.m107525e().postToWorker(new C73809a(z));
    }

    public int getType() {
        return 3;
    }

    /* renamed from: o */
    public RecyclerView.C16631z mo102829o(ViewGroup viewGroup, int i) {
        return new C73815d(this, LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cb8, viewGroup, false));
    }

    /* renamed from: p */
    public C78211g.C78219f mo102830p() {
        return new C73811b();
    }
}
