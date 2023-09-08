package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.C93745z1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import nj3.C76879j;
import pb1.C100755z;
import pc1.C100774c;

/* renamed from: com.tencent.mm.plugin.fav.ui.x0 */
public class C93729x0 implements C100774c.C100778d {

    /* renamed from: a */
    public final /* synthetic */ FavSearchUI f270564a;

    /* renamed from: com.tencent.mm.plugin.fav.ui.x0$a */
    public class C93730a implements DialogInterface.OnClickListener {
        public C93730a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatActivity context = C93729x0.this.f270564a.getContext();
            FavSearchUI favSearchUI = C93729x0.this.f270564a;
            C93745z1.m118450g(context, 4105, favSearchUI.f269809n, favSearchUI.f269799K);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.x0$b */
    public class C93731b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f270566d;

        /* renamed from: e */
        public final /* synthetic */ boolean f270567e;

        /* renamed from: com.tencent.mm.plugin.fav.ui.x0$b$a */
        public class C93732a implements C93745z1.C93749c {

            /* renamed from: com.tencent.mm.plugin.fav.ui.x0$b$a$a */
            public class C93733a implements Runnable {
                public C93733a() {
                }

                public void run() {
                    C93729x0.this.f270564a.f269809n.notifyDataSetChanged();
                }
            }

            public C93732a() {
            }

            /* renamed from: a */
            public void mo128364a() {
                if (C93729x0.this.f270564a.f269809n != null) {
                    Log.m105926v("MicroMsg.FavSearchUI", "do refresh job");
                    C93729x0.this.f270564a.f269809n.mo128369b();
                    MMHandlerThread.postToMainThread(new C93733a());
                }
            }
        }

        public C93731b(ArrayList arrayList, boolean z) {
            this.f270566d = arrayList;
            this.f270567e = z;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C93745z1.m118444a(C93729x0.this.f270564a.getContext(), this.f270566d, new C93732a(), 26);
            FavSearchUI favSearchUI = C93729x0.this.f270564a;
            int i2 = FavSearchUI.f269788N;
            favSearchUI.mo128298N7();
            if (this.f270567e) {
                FavSearchUI.m118045R7(C93729x0.this.f270564a.getContext());
            }
        }
    }

    public C93729x0(FavSearchUI favSearchUI) {
        this.f270564a = favSearchUI;
    }

    /* renamed from: a */
    public void mo128359a() {
    }

    /* renamed from: b */
    public void mo128360b() {
        if (FavoriteIndexUI.m118089T7(this.f270564a.f269809n.mo128379i(false), this.f270564a, new C93730a())) {
            AppCompatActivity context = this.f270564a.getContext();
            FavSearchUI favSearchUI = this.f270564a;
            C93745z1.m118450g(context, 4105, favSearchUI.f269809n, favSearchUI.f269799K);
        }
    }

    /* renamed from: c */
    public void mo128361c() {
        List<C100755z> i = this.f270564a.f269809n.mo128379i(true);
        LinkedList linkedList = (LinkedList) i;
        if (linkedList.size() == 0) {
            Log.m105920e("MicroMsg.FavSearchUI", "FavEditFooter onDelRequest list == null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        boolean z = false;
        for (C100755z next : i) {
            if (next.f295172Q0) {
                hashSet.add(Long.valueOf(next.field_localId));
                z = true;
            } else {
                arrayList.add(next);
            }
        }
        if (arrayList.size() != 0) {
            C76879j.m92750u(this.f270564a.getContext(), this.f270564a.getString(C0966R.string.cn5), "", new C93731b(arrayList, z), (DialogInterface.OnClickListener) null);
        } else if (hashSet.size() >= 2) {
            FavSearchUI.m118045R7(this.f270564a.getContext());
        } else {
            FavSearchUI.m118043K7(this.f270564a, (View) null, 0, (C100755z) linkedList.get(0));
        }
    }
}
