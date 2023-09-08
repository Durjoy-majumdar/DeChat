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

/* renamed from: com.tencent.mm.plugin.fav.ui.a0 */
public class C93479a0 implements C100774c.C100778d {

    /* renamed from: a */
    public final /* synthetic */ FavFilterUI f269960a;

    /* renamed from: com.tencent.mm.plugin.fav.ui.a0$a */
    public class C93480a implements DialogInterface.OnClickListener {
        public C93480a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatActivity context = C93479a0.this.f269960a.getContext();
            FavFilterUI favFilterUI = C93479a0.this.f269960a;
            C93745z1.m118450g(context, 4105, favFilterUI.f269694o, favFilterUI.f269683C);
            C93479a0.this.f269960a.mo128259M7(3, 0, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.a0$b */
    public class C93481b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f269962d;

        /* renamed from: e */
        public final /* synthetic */ boolean f269963e;

        /* renamed from: com.tencent.mm.plugin.fav.ui.a0$b$a */
        public class C93482a implements C93745z1.C93749c {

            /* renamed from: com.tencent.mm.plugin.fav.ui.a0$b$a$a */
            public class C93483a implements Runnable {
                public C93483a() {
                }

                public void run() {
                    C93479a0.this.f269960a.f269694o.notifyDataSetChanged();
                }
            }

            public C93482a() {
            }

            /* renamed from: a */
            public void mo128364a() {
                if (C93479a0.this.f269960a.f269694o != null) {
                    Log.m105926v("MicroMsg.FavFilterUI", "do refresh job");
                    C93479a0.this.f269960a.f269694o.mo128369b();
                    MMHandlerThread.postToMainThread(new C93483a());
                    C93479a0.this.f269960a.mo128259M7(6, 0, false);
                }
            }
        }

        public C93481b(ArrayList arrayList, boolean z) {
            this.f269962d = arrayList;
            this.f269963e = z;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C93745z1.m118444a(C93479a0.this.f269960a.getContext(), this.f269962d, new C93482a(), 25);
            FavFilterUI favFilterUI = C93479a0.this.f269960a;
            int i2 = FavFilterUI.f269680F;
            favFilterUI.mo128257K7();
            if (this.f269963e) {
                FavFilterUI.m117998H7(C93479a0.this.f269960a);
            }
        }
    }

    public C93479a0(FavFilterUI favFilterUI) {
        this.f269960a = favFilterUI;
    }

    /* renamed from: a */
    public void mo128359a() {
    }

    /* renamed from: b */
    public void mo128360b() {
        if (FavoriteIndexUI.m118089T7(this.f269960a.f269694o.mo128379i(false), this.f269960a, new C93480a())) {
            AppCompatActivity context = this.f269960a.getContext();
            FavFilterUI favFilterUI = this.f269960a;
            C93745z1.m118450g(context, 4105, favFilterUI.f269694o, favFilterUI.f269683C);
            this.f269960a.mo128259M7(3, 0, false);
        }
    }

    /* renamed from: c */
    public void mo128361c() {
        List<C100755z> i = this.f269960a.f269694o.mo128379i(true);
        LinkedList linkedList = (LinkedList) i;
        if (linkedList.size() == 0) {
            Log.m105920e("MicroMsg.FavFilterUI", "FavEditFooter onDelRequest list == null");
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
            C76879j.m92750u(this.f269960a.getContext(), this.f269960a.getString(C0966R.string.cn5), "", new C93481b(arrayList, z), (DialogInterface.OnClickListener) null);
        } else if (hashSet.size() >= 2) {
            FavFilterUI.m117998H7(this.f269960a);
        } else {
            FavFilterUI.m117999I7(this.f269960a, (View) null, 0, (C100755z) linkedList.get(0));
        }
    }
}
