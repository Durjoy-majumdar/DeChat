package com.tencent.p014mm.plugin.record.p094ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.plugin.record.p094ui.viewWrappers.ImageViewWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import eb0.C45628s0;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import p196ln.C76706g;
import sg2.C101617b;
import te3.C101834rc0;

/* renamed from: com.tencent.mm.plugin.record.ui.i */
public abstract class C94356i extends BaseAdapter {

    /* renamed from: d */
    public int f272710d = -1;

    /* renamed from: e */
    public String f272711e = "";

    /* renamed from: f */
    public Context f272712f;

    /* renamed from: g */
    public MMHandler f272713g = null;

    /* renamed from: h */
    public SparseArray<C94363d> f272714h = new SparseArray<>();

    /* renamed from: i */
    public boolean f272715i = false;

    /* renamed from: j */
    public boolean f272716j = false;

    /* renamed from: n */
    public boolean f272717n = false;

    /* renamed from: o */
    public int f272718o = C76577a.m92151b(this.f272712f, 35);

    /* renamed from: p */
    public ListView f272719p;

    /* renamed from: q */
    public List<C101834rc0> f272720q = new LinkedList();

    /* renamed from: r */
    public C94346a f272721r;

    /* renamed from: s */
    public C94359c f272722s;

    /* renamed from: t */
    public TranslateHelper f272723t;

    /* renamed from: u */
    public int f272724u = 0;

    /* renamed from: v */
    public String f272725v = "";

    /* renamed from: w */
    public String f272726w = "";

    /* renamed from: x */
    public Runnable f272727x = new C94358b();

    /* renamed from: com.tencent.mm.plugin.record.ui.i$a */
    public class C94357a extends MMHandler {
        public C94357a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                Log.m105918d("MicroMsg.RecordMsgBaseAdapter", "do play music");
                C94356i.this.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.record.ui.i$b */
    public class C94358b implements Runnable {
        public C94358b() {
        }

        public void run() {
            Log.m105918d("MicroMsg.RecordMsgBaseAdapter", "refresh adapter");
            C94356i.this.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.record.ui.i$c */
    public interface C94359c {

        /* renamed from: com.tencent.mm.plugin.record.ui.i$c$a */
        public static class C94360a {

            /* renamed from: a */
            public ImageView f272730a;

            /* renamed from: b */
            public C101834rc0 f272731b;

            /* renamed from: c */
            public long f272732c;

            /* renamed from: d */
            public int f272733d;

            /* renamed from: e */
            public int f272734e;

            /* renamed from: f */
            public int f272735f;
        }

        /* renamed from: com.tencent.mm.plugin.record.ui.i$c$b */
        public static class C94361b {

            /* renamed from: a */
            public C101834rc0 f272736a;

            /* renamed from: b */
            public long f272737b;

            /* renamed from: c */
            public int f272738c;

            /* renamed from: d */
            public boolean f272739d;
        }

        /* renamed from: com.tencent.mm.plugin.record.ui.i$c$c */
        public static class C94362c {

            /* renamed from: a */
            public C101834rc0 f272740a;

            /* renamed from: b */
            public long f272741b;
        }

        /* renamed from: a */
        Bitmap mo129735a(C94361b bVar);

        /* renamed from: b */
        Bitmap mo129736b(C94362c cVar);

        /* renamed from: c */
        void mo129737c(C94360a aVar);

        /* renamed from: d */
        void mo129738d();
    }

    /* renamed from: com.tencent.mm.plugin.record.ui.i$d */
    public interface C94363d {
        /* renamed from: a */
        void mo129755a(View view, int i, C101617b bVar, Object obj);

        /* renamed from: b */
        View mo129756b(Context context);

        void destroy();

        void pause();
    }

    public C94356i(Context context, C94359c cVar) {
        this.f272712f = context;
        this.f272713g = new C94357a(Looper.getMainLooper());
        this.f272722s = cVar;
    }

    /* renamed from: a */
    public void mo129745a() {
        for (int i = 0; i < this.f272714h.size(); i++) {
            C94363d valueAt = this.f272714h.valueAt(i);
            if (valueAt != null) {
                valueAt.destroy();
            }
        }
        C94359c cVar = this.f272722s;
        if (cVar != null) {
            cVar.mo129738d();
            this.f272722s = null;
        }
    }

    /* renamed from: b */
    public abstract int mo129739b();

    /* renamed from: d */
    public C101834rc0 getItem(int i) {
        List<C101834rc0> list = this.f272720q;
        if (list != null && i >= 0 && i < ((LinkedList) list).size()) {
            return (C101834rc0) ((LinkedList) this.f272720q).get(i);
        }
        return null;
    }

    /* renamed from: f */
    public final void mo129747f(String str) {
        if (!C45628s0.m50740E(str)) {
            C68097n nVar = new C68097n();
            nVar.f195728a = str;
            ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93608Yt(nVar);
        }
    }

    /* renamed from: g */
    public abstract void mo129740g(C101617b bVar);

    public int getCount() {
        List<C101834rc0> list = this.f272720q;
        if (list == null) {
            return 0;
        }
        return ((LinkedList) list).size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        int i2 = getItem(i).f299258I;
        if (i2 == 1) {
            return 0;
        }
        if (i2 != 2) {
            return i2 != 3 ? 3 : 2;
        }
        return 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v45, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: android.text.SpannableString} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0460  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x04b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r27, android.view.View r28, android.view.ViewGroup r29) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            java.lang.Class<m02.b> r2 = m02.C46940b.class
            java.lang.Class<d62.i> r3 = d62.C75339i.class
            java.lang.Class<ln.f> r4 = p196ln.C76705f.class
            te3.rc0 r5 = r26.getItem(r27)
            android.util.SparseArray<com.tencent.mm.plugin.record.ui.i$d> r6 = r0.f272714h
            int r7 = r5.f299258I
            r8 = 3
            r9 = 2
            r11 = 1
            if (r7 == r11) goto L_0x0021
            if (r7 == r9) goto L_0x001f
            if (r7 == r8) goto L_0x001d
            r7 = 3
            goto L_0x0022
        L_0x001d:
            r7 = 2
            goto L_0x0022
        L_0x001f:
            r7 = 1
            goto L_0x0022
        L_0x0021:
            r7 = 0
        L_0x0022:
            java.lang.Object r6 = r6.get(r7)
            com.tencent.mm.plugin.record.ui.i$d r6 = (com.tencent.p014mm.plugin.record.p094ui.C94356i.C94363d) r6
            if (r28 != 0) goto L_0x0031
            android.content.Context r7 = r0.f272712f
            android.view.View r7 = r6.mo129756b(r7)
            goto L_0x0033
        L_0x0031:
            r7 = r28
        L_0x0033:
            int r12 = r5.f299258I
            if (r12 == r9) goto L_0x0047
            r13 = 15
            if (r12 == r13) goto L_0x0041
            sg2.b r12 = new sg2.b
            r12.<init>()
            goto L_0x004c
        L_0x0041:
            sg2.c r12 = new sg2.c
            r12.<init>()
            goto L_0x004c
        L_0x0047:
            sg2.a r12 = new sg2.a
            r12.<init>()
        L_0x004c:
            r12.f297464a = r5
            java.lang.String r13 = r0.f272725v
            r12.f297471h = r13
            java.lang.String r13 = r0.f272726w
            r12.f297472i = r13
            r0.mo129740g(r12)
            com.tencent.mm.plugin.record.ui.TranslateHelper r13 = r0.f272723t
            r6.mo129755a(r7, r1, r12, r13)
            r6 = 2131311984(0x7f093d70, float:1.8242324E38)
            android.view.View r6 = r7.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r12 = 2131311988(0x7f093d74, float:1.8242332E38)
            android.view.View r12 = r7.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            java.lang.String r13 = r5.f299298d1
            te3.sc0 r14 = r5.f299296c1
            if (r14 == 0) goto L_0x0112
            te3.tc0 r14 = r14.f299405d
            if (r14 == 0) goto L_0x0112
            boolean r15 = r14.f299526p
            java.lang.String r9 = ")"
            java.lang.String r10 = "("
            if (r15 == 0) goto L_0x00aa
            di3.d r15 = di3.C86312j.m106911c(r3)
            d62.i r15 = (d62.C75339i) r15
            java.lang.String r11 = r14.f299525o
            java.lang.String r11 = r15.mo62515Si(r11)
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r15 != 0) goto L_0x00d5
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r13)
            r15.append(r10)
            r15.append(r11)
            r15.append(r9)
            java.lang.String r13 = r15.toString()
            goto L_0x00d5
        L_0x00aa:
            boolean r11 = r14.f299520g
            if (r11 == 0) goto L_0x00d5
            di3.d r11 = di3.C86312j.m106911c(r3)
            d62.i r11 = (d62.C75339i) r11
            java.lang.String r15 = r14.f299519f
            java.lang.String r11 = r11.mo62515Si(r15)
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r15 != 0) goto L_0x00d5
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r13)
            r15.append(r10)
            r15.append(r11)
            r15.append(r9)
            java.lang.String r13 = r15.toString()
        L_0x00d5:
            boolean r11 = r14.f299516E
            if (r11 == 0) goto L_0x0112
            java.lang.String r11 = r14.f299515D
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x0112
            di3.d r11 = di3.C86312j.m106911c(r2)
            m02.b r11 = (m02.C46940b) r11
            java.lang.String r14 = r14.f299515D
            java.lang.String r11 = r11.mo72127jk(r14, r8)
            di3.d r3 = di3.C86312j.m106911c(r3)
            d62.i r3 = (d62.C75339i) r3
            java.lang.String r3 = r3.mo62515Si(r11)
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r11 != 0) goto L_0x0112
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r13)
            r11.append(r10)
            r11.append(r3)
            r11.append(r9)
            java.lang.String r13 = r11.toString()
        L_0x0112:
            java.lang.Class<ny.h> r3 = p629ny.C76979h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            android.content.Context r9 = r12.getContext()
            float r10 = r12.getTextSize()
            android.text.SpannableString r3 = r3.yp0(r9, r13, r10)
            java.lang.String r9 = r5.f299245B1
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x0132
            r12.setText(r3)
            goto L_0x0164
        L_0x0132:
            java.lang.String r9 = r5.f299245B1
            if (r9 != 0) goto L_0x0137
            goto L_0x0161
        L_0x0137:
            android.text.SpannableStringBuilder r10 = new android.text.SpannableStringBuilder
            r10.<init>(r3)
            int r3 = r10.length()
            r10.append(r9)
            int r9 = r10.length()
            android.text.style.ForegroundColorSpan r11 = new android.text.style.ForegroundColorSpan
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131101266(0x7f060652, float:1.7814937E38)
            int r13 = r13.getColor(r14)
            r11.<init>(r13)
            r13 = 33
            r10.setSpan(r11, r3, r9, r13)
            r3 = r10
        L_0x0161:
            r12.setText(r3)
        L_0x0164:
            r3 = 2131311987(0x7f093d73, float:1.824233E38)
            android.view.View r3 = r7.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.String r9 = r5.f299302f1
            r11 = 0
            r10[r11] = r9
            java.lang.String r9 = "MicroMsg.RecordMsgBaseAdapter"
            java.lang.String r11 = "datasrctime %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r11, r10)
            java.lang.String r9 = r5.f299302f1
            if (r9 == 0) goto L_0x025f
            boolean r10 = r0.f272715i
            java.lang.String r11 = " "
            if (r10 == 0) goto L_0x01dc
            java.lang.String[] r10 = r9.split(r11)
            int r12 = r10.length
            r13 = 2
            if (r12 >= r13) goto L_0x0195
            java.lang.String r9 = r5.f299302f1
            r3.setText(r9)
            goto L_0x025f
        L_0x0195:
            r12 = 0
            r13 = r10[r12]
            java.text.SimpleDateFormat r12 = new java.text.SimpleDateFormat     // Catch:{ ParseException -> 0x01b8 }
            java.lang.String r14 = "yyyy-MM-dd"
            r12.<init>(r14)     // Catch:{ ParseException -> 0x01b8 }
            java.util.Date r12 = r12.parse(r13)     // Catch:{ ParseException -> 0x01b8 }
            long r14 = r12.getTime()     // Catch:{ ParseException -> 0x01b8 }
            android.content.Context r12 = r0.f272712f     // Catch:{ ParseException -> 0x01b8 }
            r8 = 2131830331(0x7f11263b, float:1.9293656E38)
            java.lang.String r8 = r12.getString(r8)     // Catch:{ ParseException -> 0x01b8 }
            java.lang.CharSequence r8 = android.text.format.DateFormat.format(r8, r14)     // Catch:{ ParseException -> 0x01b8 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ ParseException -> 0x01b8 }
            r13 = r8
        L_0x01b8:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r13)
            r8.append(r11)
            r11 = 0
            r10 = r10[r11]
            int r10 = r10.length()
            r11 = 1
            int r10 = r10 + r11
            java.lang.String r9 = r9.substring(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r3.setText(r8)
            goto L_0x025f
        L_0x01dc:
            boolean r8 = r0.f272716j
            if (r8 == 0) goto L_0x023f
            java.lang.String[] r8 = r9.split(r11)
            int r10 = r8.length
            r12 = 2
            if (r10 >= r12) goto L_0x01ee
            java.lang.String r8 = r5.f299302f1
            r3.setText(r8)
            goto L_0x025f
        L_0x01ee:
            r10 = 0
            r12 = r8[r10]
            java.lang.String r10 = "-"
            int r10 = r12.indexOf(r10)
            r13 = 1
            int r10 = r10 + r13
            java.lang.String r10 = r12.substring(r10)
            java.text.SimpleDateFormat r12 = new java.text.SimpleDateFormat     // Catch:{ ParseException -> 0x021c }
            java.lang.String r13 = "MM-dd"
            r12.<init>(r13)     // Catch:{ ParseException -> 0x021c }
            java.util.Date r12 = r12.parse(r10)     // Catch:{ ParseException -> 0x021c }
            long r12 = r12.getTime()     // Catch:{ ParseException -> 0x021c }
            android.content.Context r14 = r0.f272712f     // Catch:{ ParseException -> 0x021c }
            r15 = 2131830311(0x7f112627, float:1.9293616E38)
            java.lang.String r14 = r14.getString(r15)     // Catch:{ ParseException -> 0x021c }
            java.lang.CharSequence r12 = android.text.format.DateFormat.format(r14, r12)     // Catch:{ ParseException -> 0x021c }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ ParseException -> 0x021c }
            r10 = r12
        L_0x021c:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            r12.append(r11)
            r10 = 0
            r8 = r8[r10]
            int r8 = r8.length()
            r10 = 1
            int r8 = r8 + r10
            java.lang.String r8 = r9.substring(r8)
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            r3.setText(r8)
            goto L_0x025f
        L_0x023f:
            java.lang.String[] r8 = r9.split(r11)
            int r9 = r8.length
            r10 = 2
            if (r9 >= r10) goto L_0x024d
            java.lang.String r8 = r5.f299302f1
            r3.setText(r8)
            goto L_0x025f
        L_0x024d:
            java.lang.String r9 = r5.f299302f1
            r10 = 0
            r8 = r8[r10]
            int r8 = r8.length()
            r10 = 1
            int r8 = r8 + r10
            java.lang.String r8 = r9.substring(r8)
            r3.setText(r8)
        L_0x025f:
            r3 = 8
            if (r1 != 0) goto L_0x03f9
            te3.sc0 r8 = r5.f299296c1
            if (r8 == 0) goto L_0x03e2
            te3.tc0 r8 = r8.f299405d
            r9 = 0
            r6.setVisibility(r9)
            if (r8 == 0) goto L_0x02bb
            boolean r9 = r8.f299526p
            if (r9 == 0) goto L_0x02bb
            java.lang.String r2 = r8.f299525o
            r0.mo129747f(r2)
            java.lang.String r2 = r8.f299525o
            boolean r2 = sb0.C48340e.m53674o(r2)
            if (r2 == 0) goto L_0x028f
            gc0.a r2 = gc0.C20828a.m22825b()
            java.lang.String r4 = r8.f299525o
            java.lang.String r4 = sb0.C48340e.m53665f(r4)
            r2.mo32518g(r4, r6)
            goto L_0x05b4
        L_0x028f:
            java.lang.String r2 = r8.f299525o
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r2 == 0) goto L_0x02ae
            boolean r2 = r5.f299249D1
            if (r2 == 0) goto L_0x02ae
            java.lang.String r2 = r5.f299247C1
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x02ae
            gc0.a r2 = gc0.C20828a.m22825b()
            java.lang.String r4 = r5.f299247C1
            r2.mo32518g(r4, r6)
            goto L_0x05b4
        L_0x02ae:
            di3.d r2 = di3.C86312j.m106911c(r4)
            ln.f r2 = (p196ln.C76705f) r2
            java.lang.String r4 = r8.f299525o
            r2.mo106849z(r6, r4)
            goto L_0x05b4
        L_0x02bb:
            if (r8 == 0) goto L_0x031f
            boolean r9 = r8.f299520g
            if (r9 == 0) goto L_0x031f
            java.lang.String r2 = eb0.C75592q0.m90789s()
            java.lang.String r9 = r8.f299519f
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x02ee
            java.lang.String r2 = r8.f299519f
            java.lang.String r9 = r8.f299521h
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x02ee
            r6.setVisibility(r3)
            int r2 = r0.f272718o
            int r4 = r7.getPaddingTop()
            int r5 = r0.f272718o
            int r6 = r7.getPaddingBottom()
            r7.setPadding(r2, r4, r5, r6)
            r2 = 1
            r0.f272717n = r2
            goto L_0x05b4
        L_0x02ee:
            java.lang.String r2 = r8.f299519f
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r2 == 0) goto L_0x030d
            boolean r2 = r5.f299249D1
            if (r2 == 0) goto L_0x030d
            java.lang.String r2 = r5.f299247C1
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x030d
            gc0.a r2 = gc0.C20828a.m22825b()
            java.lang.String r4 = r5.f299247C1
            r2.mo32518g(r4, r6)
            goto L_0x05b4
        L_0x030d:
            java.lang.String r2 = r8.f299519f
            r0.mo129747f(r2)
            di3.d r2 = di3.C86312j.m106911c(r4)
            ln.f r2 = (p196ln.C76705f) r2
            java.lang.String r4 = r8.f299519f
            r2.mo106849z(r6, r4)
            goto L_0x05b4
        L_0x031f:
            if (r8 == 0) goto L_0x03b4
            boolean r9 = r8.f299516E
            if (r9 == 0) goto L_0x03b4
            java.lang.String r9 = r8.f299515D
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x03b4
            di3.d r2 = di3.C86312j.m106911c(r2)
            m02.b r2 = (m02.C46940b) r2
            java.lang.String r9 = r8.f299515D
            r10 = 3
            java.lang.String r2 = r2.mo72127jk(r9, r10)
            boolean r9 = sb0.C48340e.m53674o(r2)
            if (r9 == 0) goto L_0x0352
            java.lang.String r4 = r8.f299525o
            r0.mo129747f(r4)
            gc0.a r4 = gc0.C20828a.m22825b()
            java.lang.String r2 = sb0.C48340e.m53665f(r2)
            r4.mo32518g(r2, r6)
            goto L_0x05b4
        L_0x0352:
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r8 == 0) goto L_0x036f
            boolean r8 = r5.f299249D1
            if (r8 == 0) goto L_0x036f
            java.lang.String r8 = r5.f299247C1
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x036f
            gc0.a r2 = gc0.C20828a.m22825b()
            java.lang.String r4 = r5.f299247C1
            r2.mo32518g(r4, r6)
            goto L_0x05b4
        L_0x036f:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r8 != 0) goto L_0x0386
            boolean r8 = eb0.C45628s0.m50740E(r2)
            if (r8 == 0) goto L_0x0386
            di3.d r4 = di3.C86312j.m106911c(r4)
            ln.f r4 = (p196ln.C76705f) r4
            r4.mo106849z(r6, r2)
            goto L_0x05b4
        L_0x0386:
            boolean r2 = r5.f299249D1
            if (r2 == 0) goto L_0x039d
            java.lang.String r2 = r5.f299247C1
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x039d
            gc0.a r2 = gc0.C20828a.m22825b()
            java.lang.String r4 = r5.f299247C1
            r2.mo32518g(r4, r6)
            goto L_0x05b4
        L_0x039d:
            r6.setVisibility(r3)
            int r2 = r0.f272718o
            int r4 = r7.getPaddingTop()
            int r5 = r0.f272718o
            int r6 = r7.getPaddingBottom()
            r7.setPadding(r2, r4, r5, r6)
            r2 = 1
            r0.f272717n = r2
            goto L_0x05b4
        L_0x03b4:
            boolean r2 = r5.f299249D1
            if (r2 == 0) goto L_0x03cb
            java.lang.String r2 = r5.f299247C1
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x03cb
            gc0.a r2 = gc0.C20828a.m22825b()
            java.lang.String r4 = r5.f299247C1
            r2.mo32518g(r4, r6)
            goto L_0x05b4
        L_0x03cb:
            r6.setVisibility(r3)
            int r2 = r0.f272718o
            int r4 = r7.getPaddingTop()
            int r5 = r0.f272718o
            int r6 = r7.getPaddingBottom()
            r7.setPadding(r2, r4, r5, r6)
            r2 = 1
            r0.f272717n = r2
            goto L_0x05b4
        L_0x03e2:
            r2 = 1
            r6.setVisibility(r3)
            int r4 = r0.f272718o
            int r5 = r7.getPaddingTop()
            int r6 = r0.f272718o
            int r8 = r7.getPaddingBottom()
            r7.setPadding(r4, r5, r6, r8)
            r0.f272717n = r2
            goto L_0x05b4
        L_0x03f9:
            if (r1 <= 0) goto L_0x05a2
            boolean r8 = r0.f272717n
            if (r8 != 0) goto L_0x05a2
            te3.sc0 r8 = r5.f299296c1
            te3.tc0 r8 = r8.f299405d
            int r9 = r1 + -1
            te3.rc0 r10 = r0.getItem(r9)
            te3.sc0 r10 = r10.f299296c1
            te3.tc0 r10 = r10.f299405d
            boolean r10 = r10.f299526p
            java.lang.String r11 = ""
            if (r10 == 0) goto L_0x041e
            te3.rc0 r9 = r0.getItem(r9)
            te3.sc0 r9 = r9.f299296c1
            te3.tc0 r9 = r9.f299405d
            java.lang.String r9 = r9.f299525o
            goto L_0x0434
        L_0x041e:
            te3.rc0 r10 = r0.getItem(r9)
            te3.sc0 r10 = r10.f299296c1
            te3.tc0 r10 = r10.f299405d
            boolean r10 = r10.f299520g
            if (r10 == 0) goto L_0x043b
            te3.rc0 r9 = r0.getItem(r9)
            te3.sc0 r9 = r9.f299296c1
            te3.tc0 r9 = r9.f299405d
            java.lang.String r9 = r9.f299519f
        L_0x0434:
            r10 = 0
            r25 = r11
            r11 = r9
            r9 = r25
            goto L_0x0454
        L_0x043b:
            te3.rc0 r10 = r0.getItem(r9)
            te3.sc0 r10 = r10.f299296c1
            te3.tc0 r10 = r10.f299405d
            boolean r10 = r10.f299516E
            if (r10 == 0) goto L_0x0452
            te3.rc0 r9 = r0.getItem(r9)
            te3.sc0 r9 = r9.f299296c1
            te3.tc0 r9 = r9.f299405d
            java.lang.String r9 = r9.f299515D
            goto L_0x0453
        L_0x0452:
            r9 = r11
        L_0x0453:
            r10 = 0
        L_0x0454:
            r6.setVisibility(r10)
            te3.sc0 r10 = r5.f299296c1
            te3.tc0 r10 = r10.f299405d
            boolean r12 = r10.f299526p
            r13 = 4
            if (r12 == 0) goto L_0x04b1
            java.lang.String r2 = r10.f299525o
            boolean r9 = r11.equals(r2)
            if (r9 != 0) goto L_0x04ac
            r0.mo129747f(r2)
            if (r8 == 0) goto L_0x0484
            java.lang.String r9 = r8.f299525o
            boolean r9 = sb0.C48340e.m53674o(r9)
            if (r9 == 0) goto L_0x0484
            gc0.a r2 = gc0.C20828a.m22825b()
            java.lang.String r4 = r8.f299525o
            java.lang.String r4 = sb0.C48340e.m53665f(r4)
            r2.mo32518g(r4, r6)
            goto L_0x05b4
        L_0x0484:
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r8 == 0) goto L_0x04a1
            boolean r8 = r5.f299249D1
            if (r8 == 0) goto L_0x04a1
            java.lang.String r8 = r5.f299247C1
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x04a1
            gc0.a r2 = gc0.C20828a.m22825b()
            java.lang.String r4 = r5.f299247C1
            r2.mo32518g(r4, r6)
            goto L_0x05b4
        L_0x04a1:
            di3.d r4 = di3.C86312j.m106911c(r4)
            ln.f r4 = (p196ln.C76705f) r4
            r4.mo106849z(r6, r2)
            goto L_0x05b4
        L_0x04ac:
            r6.setVisibility(r13)
            goto L_0x05b4
        L_0x04b1:
            boolean r12 = r10.f299520g
            if (r12 == 0) goto L_0x04ed
            java.lang.String r2 = r10.f299519f
            boolean r8 = r11.equals(r2)
            if (r8 != 0) goto L_0x04e8
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r8 == 0) goto L_0x04da
            boolean r8 = r5.f299249D1
            if (r8 == 0) goto L_0x04da
            java.lang.String r8 = r5.f299247C1
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x04da
            gc0.a r2 = gc0.C20828a.m22825b()
            java.lang.String r4 = r5.f299247C1
            r2.mo32518g(r4, r6)
            goto L_0x05b4
        L_0x04da:
            r0.mo129747f(r2)
            di3.d r4 = di3.C86312j.m106911c(r4)
            ln.f r4 = (p196ln.C76705f) r4
            r4.mo106849z(r6, r2)
            goto L_0x05b4
        L_0x04e8:
            r6.setVisibility(r13)
            goto L_0x05b4
        L_0x04ed:
            if (r8 == 0) goto L_0x0588
            boolean r10 = r8.f299516E
            if (r10 == 0) goto L_0x0588
            java.lang.String r10 = r8.f299515D
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x0588
            java.lang.String r10 = r8.f299515D
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x0584
            di3.d r2 = di3.C86312j.m106911c(r2)
            m02.b r2 = (m02.C46940b) r2
            java.lang.String r9 = r8.f299515D
            r10 = 3
            java.lang.String r2 = r2.mo72127jk(r9, r10)
            boolean r9 = sb0.C48340e.m53674o(r2)
            if (r9 == 0) goto L_0x0528
            java.lang.String r4 = r8.f299525o
            r0.mo129747f(r4)
            gc0.a r4 = gc0.C20828a.m22825b()
            java.lang.String r2 = sb0.C48340e.m53665f(r2)
            r4.mo32518g(r2, r6)
            goto L_0x05b4
        L_0x0528:
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r8 == 0) goto L_0x0545
            boolean r8 = r5.f299249D1
            if (r8 == 0) goto L_0x0545
            java.lang.String r8 = r5.f299247C1
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x0545
            gc0.a r2 = gc0.C20828a.m22825b()
            java.lang.String r4 = r5.f299247C1
            r2.mo32518g(r4, r6)
            goto L_0x05b4
        L_0x0545:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r8 != 0) goto L_0x055b
            boolean r8 = eb0.C45628s0.m50740E(r2)
            if (r8 == 0) goto L_0x055b
            di3.d r4 = di3.C86312j.m106911c(r4)
            ln.f r4 = (p196ln.C76705f) r4
            r4.mo106849z(r6, r2)
            goto L_0x05b4
        L_0x055b:
            boolean r2 = r5.f299249D1
            if (r2 == 0) goto L_0x0571
            java.lang.String r2 = r5.f299247C1
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0571
            gc0.a r2 = gc0.C20828a.m22825b()
            java.lang.String r4 = r5.f299247C1
            r2.mo32518g(r4, r6)
            goto L_0x05b4
        L_0x0571:
            r6.setVisibility(r3)
            int r2 = r0.f272718o
            int r4 = r7.getPaddingTop()
            int r5 = r0.f272718o
            int r6 = r7.getPaddingBottom()
            r7.setPadding(r2, r4, r5, r6)
            goto L_0x05b4
        L_0x0584:
            r6.setVisibility(r13)
            goto L_0x05b4
        L_0x0588:
            boolean r2 = r5.f299249D1
            if (r2 == 0) goto L_0x059e
            java.lang.String r2 = r5.f299247C1
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x059e
            gc0.a r2 = gc0.C20828a.m22825b()
            java.lang.String r4 = r5.f299247C1
            r2.mo32518g(r4, r6)
            goto L_0x05b4
        L_0x059e:
            r6.setVisibility(r13)
            goto L_0x05b4
        L_0x05a2:
            r6.setVisibility(r3)
            int r2 = r0.f272718o
            int r4 = r7.getPaddingTop()
            int r5 = r0.f272718o
            int r6 = r7.getPaddingBottom()
            r7.setPadding(r2, r4, r5, r6)
        L_0x05b4:
            int r2 = r26.getCount()
            r4 = 1
            int r2 = r2 - r4
            r4 = 2131311986(0x7f093d72, float:1.8242328E38)
            if (r1 != r2) goto L_0x0605
            android.view.View r1 = r7.findViewById(r4)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r3)
            java.lang.Object[] r9 = r2.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/record/ui/RecordMsgBaseAdapter"
            java.lang.String r11 = "getView"
            java.lang.String r12 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r1
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r9 = "com/tencent/mm/plugin/record/ui/RecordMsgBaseAdapter"
            java.lang.String r10 = "getView"
            java.lang.String r11 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x064c
        L_0x0605:
            android.view.View r15 = r7.findViewById(r4)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r3)
            java.lang.Object[] r18 = r1.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/record/ui/RecordMsgBaseAdapter"
            java.lang.String r20 = "getView"
            java.lang.String r21 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r15
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r15.setVisibility(r1)
            java.lang.String r16 = "com/tencent/mm/plugin/record/ui/RecordMsgBaseAdapter"
            java.lang.String r17 = "getView"
            java.lang.String r18 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
        L_0x064c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.record.p094ui.C94356i.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return 5;
    }

    /* renamed from: h */
    public abstract void mo129741h(C94346a aVar);

    /* renamed from: i */
    public ImageViewWrapper mo129744i(ImageViewWrapper imageViewWrapper) {
        return imageViewWrapper;
    }
}
