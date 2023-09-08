package com.tencent.p014mm.plugin.qqmail.p090ui;

import ag2.C27900o;
import ag2.C79540c0;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.NeedVerifyQQEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.qqmail.p090ui.C85397h;
import com.tencent.p014mm.pluginsdk.p133ui.tools.FileExplorerUI;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.FileExplorerUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k20.C9556a;
import xf2.C91196d;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI */
public class CompressPreviewUI extends MMActivity {

    /* renamed from: s */
    public static final /* synthetic */ int f248767s = 0;

    /* renamed from: d */
    public String f248768d = null;

    /* renamed from: e */
    public String f248769e = null;

    /* renamed from: f */
    public long f248770f = 0;

    /* renamed from: g */
    public String f248771g;

    /* renamed from: h */
    public C85397h f248772h = new C85397h(this);

    /* renamed from: i */
    public List<C85379f> f248773i = new ArrayList();

    /* renamed from: j */
    public String f248774j;

    /* renamed from: n */
    public ListView f248775n;

    /* renamed from: o */
    public TextView f248776o;

    /* renamed from: p */
    public ProgressBar f248777p;

    /* renamed from: q */
    public C85380g f248778q;

    /* renamed from: r */
    public C91196d.C91197a f248779r = new C85377e();

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI$b */
    public class C70335b implements MenuItem.OnMenuItemClickListener {
        public C70335b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            CompressPreviewUI.this.onKeyDown(4, (KeyEvent) null);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI$c */
    public class C70336c implements View.OnClickListener {
        public C70336c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ListView listView = CompressPreviewUI.this.f248775n;
            C9556a aVar = new C9556a();
            aVar.mo10233c(listView);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$3", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$3", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI$a */
    public class C85375a implements AdapterView.OnItemClickListener {
        public C85375a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C85379f a = CompressPreviewUI.this.f248778q.getItem(i);
            String str = a.f248784a;
            C85379f fVar = CompressPreviewUI.this.f248778q.f248790d;
            if (str.equals(fVar == null ? null : fVar.f248784a)) {
                CompressPreviewUI compressPreviewUI = CompressPreviewUI.this;
                compressPreviewUI.mo118692I7(compressPreviewUI.f248778q.mo118696b());
                C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            if (a.f248787d == 1) {
                CompressPreviewUI.this.mo118692I7(a.f248784a);
                C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            if (a.f248789f) {
                String[] strArr = {"mailid=" + CompressPreviewUI.this.f248768d, "attachid=" + a.f248784a, "compressfilepath=" + CompressPreviewUI.this.f248774j, "texttype=html"};
                Intent intent = new Intent(CompressPreviewUI.this, MailWebViewUI.class);
                intent.putExtra("uri", "/cgi-bin/viewdocument");
                intent.putExtra("params", strArr);
                intent.putExtra("baseurl", C79540c0.m96570c());
                intent.putExtra(FirebaseAnalytics.C113379b.METHOD, "get");
                String str2 = a.f248785b;
                int i2 = FileExplorerUI.f55213p;
                intent.putExtra("singleColumn", FileExplorerUtil.isImg(str2));
                intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, CompressPreviewUI.this.getString(C0966R.string.f361164hs2));
                CompressPreviewUI compressPreviewUI2 = CompressPreviewUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                CompressPreviewUI compressPreviewUI3 = compressPreviewUI2;
                C117292a.m165358d(compressPreviewUI3, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$1", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                compressPreviewUI2.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(compressPreviewUI3, "com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$1", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI$d */
    public class C85376d implements MenuItem.OnMenuItemClickListener {
        public C85376d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Intent intent = new Intent(CompressPreviewUI.this, AttachDownloadPage.class);
            intent.putExtra("attach_name", CompressPreviewUI.this.f248771g);
            intent.putExtra("mail_id", CompressPreviewUI.this.f248768d);
            intent.putExtra("attach_id", CompressPreviewUI.this.f248769e);
            intent.putExtra("total_size", CompressPreviewUI.this.f248770f);
            intent.putExtra("is_preview", 0);
            intent.putExtra("is_compress", true);
            CompressPreviewUI compressPreviewUI = CompressPreviewUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            CompressPreviewUI compressPreviewUI2 = compressPreviewUI;
            C117292a.m165358d(compressPreviewUI2, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$4", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            compressPreviewUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(compressPreviewUI2, "com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$4", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI$e */
    public class C85377e extends C91196d.C91197a {

        /* renamed from: com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI$e$a */
        public class C85378a extends C85397h.C85398a {
            public C85378a() {
            }

            /* renamed from: a */
            public void mo118649a() {
                CompressPreviewUI compressPreviewUI = CompressPreviewUI.this;
                int i = CompressPreviewUI.f248767s;
                compressPreviewUI.mo118691H7();
            }

            /* renamed from: b */
            public void mo118650b() {
            }
        }

        public C85377e() {
        }

        /* renamed from: b */
        public void mo66936b(int i, String str) {
            if (i == -5) {
                C85397h hVar = CompressPreviewUI.this.f248772h;
                hVar.f248854d = new C85378a();
                NeedVerifyQQEvent needVerifyQQEvent = new NeedVerifyQQEvent();
                NeedVerifyQQEvent.C80730a aVar = needVerifyQQEvent.f236243d;
                aVar.f236245a = hVar.f248855e;
                aVar.f236246b = new C85396g(hVar, needVerifyQQEvent);
                needVerifyQQEvent.asyncPublish(Looper.myLooper());
                return;
            }
            CompressPreviewUI.this.f248777p.setVisibility(8);
            CompressPreviewUI.this.f248776o.setVisibility(0);
            CompressPreviewUI.this.f248775n.setVisibility(8);
        }

        /* renamed from: d */
        public void mo66938d(String str, Map<String, String> map) {
            int i;
            String str2;
            Map<String, String> map2 = map;
            CompressPreviewUI.this.f248774j = map2.get(".Response.result.compressfilepath");
            int i2 = 0;
            int i3 = Util.getInt(map2.get(".Response.result.filelist.count"), 0);
            int i4 = 0;
            while (i4 < i3) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(".Response.result.filelist.list.item");
                    sb.append(i4 > 0 ? Integer.valueOf(i4) : "");
                    String sb4 = sb.toString();
                    String str3 = map2.get(sb4 + ".path");
                    if (str3 != null) {
                        String decode = URLDecoder.decode(str3, "utf-8");
                        String str4 = map2.get(sb4 + ".parentpath");
                        int i5 = Util.getInt(map2.get(sb4 + ".size"), i2);
                        int i6 = Util.getInt(map2.get(sb4 + ".type"), i2);
                        boolean equals = map2.get(sb4 + ".preview").equals("1");
                        String str5 = map2.get(sb4 + ".name");
                        CompressPreviewUI compressPreviewUI = CompressPreviewUI.this;
                        List<C85379f> list = compressPreviewUI.f248773i;
                        if (i5 == 0) {
                            i = i4;
                            str2 = "";
                        } else {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("(");
                            i = i4;
                            sb5.append(Util.getSizeKB((long) i5));
                            sb5.append(")");
                            str2 = sb5.toString();
                        }
                        ((ArrayList) list).add(new C85379f(compressPreviewUI, decode, str5, str4, i6, str2, equals));
                    } else {
                        i = i4;
                    }
                    i4 = i + 1;
                    i2 = 0;
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.CompressPreviewUI", e, "", new Object[0]);
                }
            }
            CompressPreviewUI.this.mo118692I7("");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI$f */
    public class C85379f {

        /* renamed from: a */
        public String f248784a;

        /* renamed from: b */
        public String f248785b;

        /* renamed from: c */
        public String f248786c;

        /* renamed from: d */
        public int f248787d;

        /* renamed from: e */
        public String f248788e;

        /* renamed from: f */
        public boolean f248789f;

        public C85379f(CompressPreviewUI compressPreviewUI, String str, String str2, String str3, int i, String str4, boolean z) {
            this.f248784a = str;
            this.f248785b = str2;
            this.f248786c = str3 == null ? "" : str3;
            this.f248787d = i;
            this.f248788e = str4;
            this.f248789f = z;
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI$g */
    public class C85380g extends BaseAdapter {

        /* renamed from: d */
        public C85379f f248790d;

        /* renamed from: e */
        public List<C85379f> f248791e = null;

        /* renamed from: com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI$g$a */
        public class C85381a {

            /* renamed from: a */
            public ImageView f248793a;

            /* renamed from: b */
            public TextView f248794b;

            /* renamed from: c */
            public TextView f248795c;

            /* renamed from: d */
            public ImageView f248796d;

            public C85381a(C85380g gVar, C85375a aVar) {
            }
        }

        public C85380g(C85375a aVar) {
        }

        /* renamed from: a */
        public C85379f getItem(int i) {
            List<C85379f> list = this.f248791e;
            if (list == null || list.size() <= i) {
                return null;
            }
            return this.f248791e.get(i);
        }

        /* renamed from: b */
        public String mo118696b() {
            String str;
            C85379f fVar = this.f248790d;
            if (!(fVar == null || (str = fVar.f248786c) == null)) {
                if (str.length() == 0) {
                    return "";
                }
                C85379f fVar2 = this.f248790d;
                int indexOf = fVar2.f248784a.indexOf(fVar2.f248786c);
                if (indexOf >= 0) {
                    return this.f248790d.f248784a.substring(0, indexOf) + this.f248790d.f248786c;
                }
            }
            return null;
        }

        public int getCount() {
            List<C85379f> list = this.f248791e;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = View.inflate(CompressPreviewUI.this.getContext(), C0966R.C0971layout.b_m, (ViewGroup) null);
                C85381a aVar = new C85381a(this, (C85375a) null);
                aVar.f248793a = (ImageView) view.findViewById(C0966R.C0970id.d0m);
                aVar.f248794b = (TextView) view.findViewById(C0966R.C0970id.d0s);
                aVar.f248795c = (TextView) view.findViewById(C0966R.C0970id.d0x);
                aVar.f248796d = (ImageView) view.findViewById(C0966R.C0970id.d0y);
                view.setTag(aVar);
            }
            C85381a aVar2 = (C85381a) view.getTag();
            C85379f a = getItem(i);
            int i2 = 0;
            if (i != 0 || mo118696b() == null) {
                ImageView imageView = aVar2.f248793a;
                boolean z = true;
                if (a.f248787d != 1) {
                    z = false;
                }
                imageView.setImageResource(z ? C0966R.C0969drawable.bjs : FileExplorerUI.m20925I7(a.f248785b));
            } else {
                aVar2.f248793a.setImageResource(C0966R.C0969drawable.bjr);
            }
            ImageView imageView2 = aVar2.f248796d;
            if (!a.f248789f) {
                i2 = 4;
            }
            imageView2.setVisibility(i2);
            aVar2.f248794b.setText(a.f248785b);
            aVar2.f248795c.setText(a.f248788e);
            return view;
        }
    }

    /* renamed from: H7 */
    public final void mo118691H7() {
        HashMap hashMap = new HashMap();
        hashMap.put("mailid", this.f248768d);
        hashMap.put("attachid", this.f248769e);
        hashMap.put("fun", "list");
        C79540c0 fI = ((C27900o) C86312j.m106911c(C27900o.class)).mo55677fI();
        C91196d.C91197a aVar = this.f248779r;
        fI.getClass();
        fI.mo109598g("/cgi-bin/viewcompress", 1, hashMap, (C91196d.C91203g) null, new C91196d.C91198b(), aVar);
    }

    /* renamed from: I7 */
    public final void mo118692I7(String str) {
        C85379f fVar;
        Log.m105924i("MicroMsg.CompressPreviewUI", "curPath=" + str);
        this.f248777p.setVisibility(8);
        this.f248776o.setVisibility(8);
        this.f248775n.setVisibility(0);
        Iterator it = ((ArrayList) this.f248773i).iterator();
        while (true) {
            if (!it.hasNext()) {
                fVar = null;
                break;
            }
            fVar = (C85379f) it.next();
            if (fVar.f248784a.equals(str)) {
                break;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (fVar != null) {
            arrayList.add(fVar);
        }
        for (int i = 0; i < ((ArrayList) this.f248773i).size(); i++) {
            C85379f fVar2 = (C85379f) ((ArrayList) this.f248773i).get(i);
            if ((str.endsWith(fVar2.f248786c) && fVar2.f248786c.length() > 0) || fVar2.f248786c.equals(str)) {
                arrayList.add(fVar2);
            }
        }
        C85380g gVar = this.f248778q;
        gVar.f248790d = fVar;
        gVar.f248791e = arrayList;
        gVar.notifyDataSetChanged();
        this.f248775n.setSelection(0);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b_n;
    }

    public void initView() {
        this.f248775n = (ListView) findViewById(C0966R.C0970id.bky);
        this.f248776o = (TextView) findViewById(C0966R.C0970id.bkw);
        ProgressBar progressBar = (ProgressBar) findViewById(C0966R.C0970id.bkx);
        this.f248777p = progressBar;
        if (this.f248768d == null || this.f248769e == null) {
            progressBar.setVisibility(8);
            this.f248776o.setText(C0966R.string.glf);
            return;
        }
        C85380g gVar = new C85380g((C85375a) null);
        this.f248778q = gVar;
        this.f248775n.setAdapter(gVar);
        this.f248775n.setOnItemClickListener(new C85375a());
        setBackBtn(new C70335b());
        setToTop(new C70336c());
        addTextOptionMenu(0, getString(C0966R.string.f7950x8), new C85376d());
        mo118691H7();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f248768d = getIntent().getStringExtra("mail_id");
        this.f248769e = getIntent().getStringExtra("attach_id");
        this.f248770f = getIntent().getLongExtra("attach_size", 0);
        this.f248771g = getIntent().getStringExtra("attach_name");
        initView();
        setMMTitle(this.f248771g);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f248772h.mo118714a();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && this.f248778q.mo118696b() != null) {
            mo118692I7(this.f248778q.mo118696b());
            return true;
        } else if (keyEvent != null) {
            return super.onKeyDown(i, keyEvent);
        } else {
            finish();
            return true;
        }
    }
}
