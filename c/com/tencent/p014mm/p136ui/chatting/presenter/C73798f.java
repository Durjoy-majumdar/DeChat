package com.tencent.p014mm.p136ui.chatting.presenter;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
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
import com.tencent.p014mm.p136ui.chatting.gallery.MediaHistoryListUI;
import com.tencent.p014mm.p136ui.gridviewheaders.C74763a;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.plugin.fav.p047ui.C93693r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import dk3.C75414f;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import k20.C9556a;
import nj3.C11184p0;
import nj3.C76912y0;
import qo3.C77407n;
import rk3.C63462a;
import uj3.C78211g;

/* renamed from: com.tencent.mm.ui.chatting.presenter.f */
public class C73798f extends C73787b {

    /* renamed from: p */
    public int f216591p = -1;

    /* renamed from: q */
    public int f216592q = -1;

    /* renamed from: com.tencent.mm.ui.chatting.presenter.f$a */
    public class C73799a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f216593d;

        /* renamed from: com.tencent.mm.ui.chatting.presenter.f$a$a */
        public class C73800a implements Runnable {
            public C73800a() {
            }

            public void run() {
                C73799a aVar = C73799a.this;
                C73798f fVar = C73798f.this;
                C75414f fVar2 = fVar.f216569f;
                if (fVar2 != null) {
                    fVar2.mo102730k(aVar.f216593d, fVar.f216572i.size());
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.presenter.f$a$b */
        public class C73801b implements Runnable {
            public C73801b() {
            }

            public void run() {
                C73799a aVar = C73799a.this;
                C73798f fVar = C73798f.this;
                C75414f fVar2 = fVar.f216569f;
                if (fVar2 != null) {
                    fVar2.mo102730k(aVar.f216593d, fVar.f216572i.size());
                }
            }
        }

        public C73799a(boolean z) {
            this.f216593d = z;
        }

        /* JADX INFO: finally extract failed */
        public void run() {
            C68070l.C68072b u;
            LinkedList linkedList = new LinkedList();
            C75875l z = C97625j3.m125812b().mo105911z();
            C73798f fVar = C73798f.this;
            Cursor LL = ((C72972g4) z).mo101073LL(fVar.f216568e, 0, fVar.f216591p);
            if (LL == null) {
                Log.m105920e("MicroMsg.FileHistoryListPresenter", "[loadData] cursor is null!");
                return;
            }
            String str = null;
            C44661m1 Lo = C72996z1.m85820U5(C73798f.this.f216568e) ? ((C44662n1) C97625j3.m125812b().mo105902q()).mo69799Lo(C73798f.this.f216568e) : null;
            long j = 0;
            while (LL.moveToNext()) {
                try {
                    C72963f4 f4Var = new C72963f4();
                    f4Var.convertFrom(LL);
                    String content = f4Var.getContent();
                    if (!(content == null || (u = C68070l.C68072b.m80422u(content, str)) == null)) {
                        C73798f fVar2 = C73798f.this;
                        int i = u.f195582i;
                        fVar2.getClass();
                        if (6 == i) {
                            long a = C74763a.m89510e().mo103933a(new Date(f4Var.getCreateTime()));
                            if (j != a) {
                                linkedList.add(new C78211g.C78217d(f4Var.getCreateTime()));
                                C73798f.this.getClass();
                            }
                            C73798f fVar3 = C73798f.this;
                            String r = fVar3.mo102843r(f4Var, C72996z1.m85820U5(fVar3.f216568e), false);
                            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(r);
                            String str2 = "";
                            if (Lo != null) {
                                str2 = Lo.mo69789q2(r);
                            }
                            int d = C93693r.m118403d(u.f195602n);
                            C73805c cVar = new C73805c(C73798f.this, f4Var.getCreateTime(), u.f195582i, u.f195570f, f4Var.getMsgId(), z1Var.getUsername(), z1Var.mo62909j3(), z1Var.mo73969n2(), str2);
                            cVar.f216601j = d;
                            cVar.f216602k = Util.getSizeKB((long) u.f195594l);
                            linkedList.add(cVar);
                            if (linkedList.size() % 20 == 0) {
                                if (C73798f.this.f216572i.size() > 0) {
                                    ArrayList<C78211g.C78216c> arrayList = C73798f.this.f216572i;
                                    if (arrayList.get(arrayList.size() - 1).mo102836a() == 2147483646) {
                                        ArrayList<C78211g.C78216c> arrayList2 = C73798f.this.f216572i;
                                        arrayList2.remove(arrayList2.size() - 1);
                                    }
                                }
                                C73798f.this.f216572i.addAll(linkedList);
                                C73798f.this.f216572i.add(new C78211g.C78221h());
                                C73798f fVar4 = C73798f.this;
                                fVar4.f216573j = fVar4.f216572i;
                                linkedList.clear();
                                MMHandlerThread.postToMainThread(new C73800a());
                            }
                            j = a;
                        }
                    }
                    str = null;
                } catch (Throwable th) {
                    LL.close();
                    throw th;
                }
            }
            LL.close();
            if (C73798f.this.f216572i.size() > 0) {
                ArrayList<C78211g.C78216c> arrayList3 = C73798f.this.f216572i;
                if (arrayList3.get(arrayList3.size() - 1).mo102836a() == 2147483646) {
                    ArrayList<C78211g.C78216c> arrayList4 = C73798f.this.f216572i;
                    arrayList4.remove(arrayList4.size() - 1);
                }
            }
            C73798f.this.f216572i.addAll(linkedList);
            C73798f fVar5 = C73798f.this;
            fVar5.f216573j = fVar5.f216572i;
            linkedList.clear();
            Log.m105925i("MicroMsg.FileHistoryListPresenter", "[loadData] data:%s", Integer.valueOf(C73798f.this.f216572i.size()));
            MMHandlerThread.postToMainThread(new C73801b());
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.f$b */
    public class C73802b implements C78211g.C78219f {

        /* renamed from: com.tencent.mm.ui.chatting.presenter.f$b$a */
        public class C73803a implements View.OnCreateContextMenuListener {

            /* renamed from: d */
            public final /* synthetic */ C78211g.C78216c f216598d;

            public C73803a(C73802b bVar, C78211g.C78216c cVar) {
                this.f216598d = cVar;
            }

            public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                contextMenu.add(0, 0, 0, view.getContext().getString(C0966R.string.i4e));
                if (!C72996z1.m85843n5(this.f216598d.f229173e) && !C72996z1.m85847r5(this.f216598d.f229173e)) {
                    contextMenu.add(0, 1, 0, view.getContext().getString(C0966R.string.b7o));
                }
                contextMenu.add(0, 2, 0, view.getContext().getString(C0966R.string.n3j));
                contextMenu.add(0, 3, 0, view.getContext().getString(C0966R.string.b_1));
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.presenter.f$b$b */
        public class C73804b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ C78211g.C78216c f216599d;

            public C73804b(C78211g.C78216c cVar) {
                this.f216599d = cVar;
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                C73798f.this.mo102845t(menuItem.getItemId(), ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f216599d.f229172d), 1);
            }
        }

        public C73802b() {
        }

        /* renamed from: a */
        public void mo102833a(View view, int i, C78211g.C78216c cVar) {
            Log.m105925i("MicroMsg.FileHistoryListPresenter", "[onItemLongClick] position:%s", Integer.valueOf(i));
            C63462a.f180011a.mo88333h(14, 1);
            new C45082x0(view.getContext()).mo70436b(view, new C73803a(this, cVar), new C73804b(cVar), (C77407n.C47880p) null);
        }

        /* renamed from: b */
        public void mo102834b(View view, int i, C78211g.C78216c cVar) {
            Log.m105925i("MicroMsg.FileHistoryListPresenter", "[onItemClick] position:%s", Integer.valueOf(i));
            C73798f fVar = C73798f.this;
            long currentTimeMillis = System.currentTimeMillis();
            fVar.f216575o = currentTimeMillis;
            if (fVar.f216575o + 30000 < currentTimeMillis) {
                fVar.f216574n = C97625j3.m125812b().mo105883I();
            }
            if (!fVar.f216574n) {
                C76912y0.m92771j(fVar.f216567d, (View) null);
                return;
            }
            Intent intent = new Intent();
            intent.setClassName(fVar.f216567d, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
            intent.putExtra("app_msg_id", cVar.f229172d);
            if (fVar.f216592q == 3) {
                intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
                intent.putExtra("app_show_share", false);
                ((MediaHistoryListUI) fVar.f216567d).startActivityForResult(intent, 4);
                return;
            }
            Context context = fVar.f216567d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/ui/chatting/presenter/FileHistoryListPresenter", "enterFileProfile", "(Lcom/tencent/mm/ui/chatting/adapter/MediaHistoryListAdapter$BaseMediaHistoryListItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/ui/chatting/presenter/FileHistoryListPresenter", "enterFileProfile", "(Lcom/tencent/mm/ui/chatting/adapter/MediaHistoryListAdapter$BaseMediaHistoryListItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.f$c */
    public class C73805c extends C78211g.C78216c {

        /* renamed from: j */
        public int f216601j;

        /* renamed from: k */
        public String f216602k;

        public C73805c(C73798f fVar, long j, int i, String str, long j2, String str2, String str3, String str4, String str5) {
            super(j, i, str, j2, str2, str3, str4, str5);
        }

        /* renamed from: a */
        public int mo102836a() {
            return 6;
        }

        /* renamed from: d */
        public boolean mo102837d(String str) {
            if (str != null) {
                return super.mo102837d(str.toLowerCase());
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.f$d */
    public class C73806d extends C78211g.C78213b {

        /* renamed from: E */
        public ImageView f216603E;

        /* renamed from: F */
        public TextView f216604F;

        public C73806d(C73798f fVar, View view) {
            super(view);
            this.f216603E = (ImageView) view.findViewById(C0966R.C0970id.cv_);
            this.f229166C.setSingleLine(false);
            this.f229166C.setMaxLines(2);
            this.f216604F = (TextView) view.findViewById(C0966R.C0970id.cuy);
        }
    }

    public C73798f(Context context) {
        super(context);
    }

    /* renamed from: c */
    public String mo102824c() {
        return this.f216567d.getString(C0966R.string.f7548jc);
    }

    /* renamed from: e */
    public String mo102825e() {
        return this.f216567d.getString(C0966R.string.f7548jc);
    }

    /* renamed from: f */
    public void mo102826f(C78211g.C78213b bVar, int i, int i2) {
        C73806d dVar = (C73806d) bVar;
        C73805c cVar = (C73805c) mo102842q(i);
        if (Util.isNullOrNil(cVar.f216602k)) {
            dVar.f216604F.setVisibility(8);
        } else {
            dVar.f216604F.setVisibility(0);
            dVar.f216604F.setText(Util.nullAs(cVar.f216602k, ""));
        }
        dVar.f216603E.setImageResource(cVar.f216601j);
    }

    /* renamed from: g */
    public void mo102827g(boolean z) {
        Log.m105925i("MicroMsg.FileHistoryListPresenter", "[loadData] isFirst:%s", Boolean.valueOf(z));
        this.f216569f.mo102729f(z);
        C86709a0.m107528h();
        C86709a0.m107525e().postToWorker(new C73799a(z));
    }

    public int getType() {
        return 6;
    }

    /* renamed from: o */
    public RecyclerView.C16631z mo102829o(ViewGroup viewGroup, int i) {
        return new C73806d(this, LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.a84, viewGroup, false));
    }

    /* renamed from: p */
    public C78211g.C78219f mo102830p() {
        return new C73802b();
    }
}
