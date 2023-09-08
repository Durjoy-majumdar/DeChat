package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.scanner.C71030z;
import com.tencent.p014mm.plugin.scanner.model.C115673w;
import com.tencent.p014mm.plugin.scanner.model.C94474a;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ke3.C88144b;
import p755xs.C102720b;
import sf0.C101592a0;

/* renamed from: com.tencent.mm.plugin.scanner.ui.g */
public class C94519g extends Preference {

    /* renamed from: J */
    public View f273329J = null;

    /* renamed from: K */
    public Context f273330K;

    /* renamed from: L */
    public List<C94474a.C94475a> f273331L = null;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.g$a */
    public static final class C71020a implements C101592a0 {

        /* renamed from: a */
        public String f205534a;

        public C71020a(String str) {
            this.f205534a = str;
        }

        /* renamed from: a */
        public String mo94817a() {
            return this.f205534a;
        }

        /* renamed from: b */
        public C101592a0.C101593b mo94818b() {
            return null;
        }

        /* renamed from: c */
        public Bitmap mo94819c(Bitmap bitmap, C101592a0.C77686a aVar, String str) {
            if (C101592a0.C77686a.NET == aVar) {
                try {
                    BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.PNG, mo94827k(), false);
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.ProductGridPreference", e, "", new Object[0]);
                }
            }
            return bitmap;
        }

        /* renamed from: d */
        public String mo94820d() {
            return this.f205534a;
        }

        /* renamed from: e */
        public Bitmap mo94821e() {
            if (MMApplicationContext.getContext() == null) {
                return null;
            }
            return BitmapFactory.decodeResource(MMApplicationContext.getContext().getResources(), C0966R.C0969drawable.bis);
        }

        /* renamed from: f */
        public void mo94822f() {
        }

        /* renamed from: g */
        public String mo94823g() {
            return this.f205534a;
        }

        /* renamed from: h */
        public boolean mo94824h() {
            return false;
        }

        /* renamed from: i */
        public void mo94825i(C101592a0.C77686a aVar, String str) {
        }

        /* renamed from: j */
        public void mo94826j(String str, boolean z) {
        }

        /* renamed from: k */
        public String mo94827k() {
            return C71030z.vx0().xx0(this.f205534a, "@S");
        }

        /* renamed from: l */
        public boolean mo94828l() {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.g$b */
    public final class C94520b extends BaseAdapter implements C102720b.C78973a {

        /* renamed from: d */
        public int f273332d;

        /* renamed from: e */
        public List<C94474a.C94475a> f273333e = new ArrayList();

        /* renamed from: f */
        public Map<String, WeakReference<ImageView>> f273334f = new HashMap();

        /* renamed from: g */
        public LayoutInflater f273335g = null;

        /* renamed from: com.tencent.mm.plugin.scanner.ui.g$b$a */
        public class C94521a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ String f273337d;

            /* renamed from: e */
            public final /* synthetic */ C94474a.C94475a f273338e;

            public C94521a(String str, C94474a.C94475a aVar) {
                this.f273337d = str;
                this.f273338e = aVar;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ProductGridPreference$ProductGridAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                String str = this.f273337d;
                C94474a.C94475a aVar = this.f273338e;
                C86709a0.m107524d().mo123460f(new C115673w(str, aVar.f273172n, aVar.f273159a, str, C94520b.this.getCount(), 11294, this.f273338e.f273166h, (String) null));
                if (!Util.isNullOrNil(this.f273337d)) {
                    Intent intent = new Intent();
                    intent.putExtra("key_Product_ID", this.f273337d);
                    C88144b.m109791i(C94519g.this.f121274d, "scanner", ".ui.ProductUI", intent, (Bundle) null);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/ProductGridPreference$ProductGridAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.scanner.ui.g$b$b */
        public class C94522b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ImageView f273340d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f273341e;

            public C94522b(C94520b bVar, ImageView imageView, Bitmap bitmap) {
                this.f273340d = imageView;
                this.f273341e = bitmap;
            }

            public void run() {
                this.f273340d.setImageBitmap(this.f273341e);
                this.f273340d.setBackgroundColor(0);
            }
        }

        /* renamed from: com.tencent.mm.plugin.scanner.ui.g$b$c */
        public class C94523c {

            /* renamed from: a */
            public ImageView f273342a;

            /* renamed from: b */
            public TextView f273343b;

            public C94523c(C94520b bVar) {
            }
        }

        public C94520b() {
            this.f273335g = LayoutInflater.from(C94519g.this.f273330K);
            ((C102720b) C86312j.m106911c(C102720b.class)).Lu0(this);
            this.f273332d = C94519g.this.f273330K.getResources().getColor(C0966R.color.f3551xh);
        }

        public int getCount() {
            return this.f273333e.size();
        }

        public Object getItem(int i) {
            return this.f273333e.get(i);
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C94523c cVar;
            if (view == null) {
                view = this.f273335g.inflate(C0966R.C0971layout.f359929bo1, viewGroup, false);
                cVar = new C94523c(this);
                cVar.f273342a = (ImageView) view.findViewById(C0966R.C0970id.eqs);
                cVar.f273343b = (TextView) view.findViewById(C0966R.C0970id.eqr);
                view.setTag(cVar);
            } else {
                cVar = (C94523c) view.getTag();
            }
            C94474a.C94475a aVar = this.f273333e.get(i);
            Bitmap N6 = ((C102720b) C86312j.m106911c(C102720b.class)).mo142104N6(new C71020a(aVar.f273181w));
            if (N6 == null || N6.isRecycled()) {
                cVar.f273342a.setBackgroundColor(this.f273332d);
                cVar.f273342a.setImageBitmap((Bitmap) null);
            } else {
                cVar.f273342a.setImageBitmap(N6);
                cVar.f273342a.setBackgroundColor(0);
            }
            cVar.f273342a.setOnClickListener(new C94521a(aVar.f273173o, aVar));
            cVar.f273342a.setTag(aVar.f273181w);
            ((HashMap) this.f273334f).put(aVar.f273181w, new WeakReference(cVar.f273342a));
            cVar.f273343b.setText(aVar.f273160b);
            return view;
        }

        /* renamed from: j3 */
        public void mo24656j3(String str, Bitmap bitmap) {
            ImageView imageView;
            if (bitmap != null && !bitmap.isRecycled() && !Util.isNullOrNil(str)) {
                Log.m105926v("MicroMsg.ProductGridPreference", "On get pic, notifyKey=" + str);
                if (((WeakReference) ((HashMap) this.f273334f).get(str)) != null && (imageView = (ImageView) ((WeakReference) ((HashMap) this.f273334f).get(str)).get()) != null && str.equals((String) imageView.getTag())) {
                    MMHandlerThread.postToMainThread(new C94522b(this, imageView, bitmap));
                }
            }
        }
    }

    public C94519g(Context context) {
        super(context);
        this.f273330K = context;
        this.f121271G = C0966R.C0971layout.f359928bo0;
    }

    /* renamed from: t */
    public View mo2020t(View view, ViewGroup viewGroup) {
        if (this.f273329J == null) {
            this.f273329J = mo1087x(viewGroup);
        }
        mo1086w(this.f273329J);
        return this.f273329J;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        C94520b bVar = new C94520b();
        ((GridView) this.f273329J.findViewById(C0966R.C0970id.gku)).setAdapter(bVar);
        List<C94474a.C94475a> list = this.f273331L;
        if (list != null) {
            ((HashMap) bVar.f273334f).clear();
            bVar.f273333e.clear();
            bVar.f273333e = list;
            bVar.notifyDataSetChanged();
        }
    }
}
