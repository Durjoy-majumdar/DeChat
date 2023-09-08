package vd3;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: vd3.j */
public final class C78401j extends LinearLayout {

    /* renamed from: j */
    public static final C78402a f229725j = new C78402a((C8480h) null);

    /* renamed from: d */
    public final String f229726d;

    /* renamed from: e */
    public final String f229727e;

    /* renamed from: f */
    public final String f229728f;

    /* renamed from: g */
    public final String f229729g;

    /* renamed from: h */
    public final String f229730h;

    /* renamed from: i */
    public LinearLayout f229731i;

    /* renamed from: vd3.j$a */
    public static final class C78402a {
        public C78402a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo108358a(Context context, TextView textView, float f) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(textView, "textView");
            Object systemService = context.getSystemService("window");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            textView.setTextSize(1, (f * displayMetrics.density) / context.getResources().getDisplayMetrics().density);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78401j(Context context, String str, String str2, String str3, String str4, String str5) {
        super(context, (AttributeSet) null, 0);
        C87412m.m108594g(context, "context");
        this.f229726d = str;
        this.f229727e = str2;
        this.f229728f = str3;
        this.f229729g = str4;
        this.f229730h = str5;
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f359628at1, this);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.mkg);
        if (textView != null) {
            C85875k4.m106191k0(textView.getPaint());
            C78402a aVar = f229725j;
            Context context2 = inflate.getContext();
            C87412m.m108593f(context2, "context");
            aVar.mo108358a(context2, textView, 14.0f);
        }
        TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.f359429kw2);
        if (textView2 != null) {
            C78402a aVar2 = f229725j;
            Context context3 = inflate.getContext();
            C87412m.m108593f(context3, "context");
            aVar2.mo108358a(context3, textView2, 14.0f);
        }
        ((RelativeLayout) inflate.findViewById(C0966R.C0970id.moc)).setOnClickListener(new C78403k(inflate, this));
        this.f229731i = (LinearLayout) inflate.findViewById(C0966R.C0970id.m3f);
        if (str3 != null) {
            mo108351b(str3);
        }
    }

    /* renamed from: a */
    public final C14436l mo108350a(String str) {
        Context context = getContext();
        C87412m.m108593f(context, "context");
        return new C14436l(context, str, (AttributeSet) null, 0, 12, (C8480h) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        if (r9.equals(com.tencent.xweb.FileReaderHelper.XLS_EXT) == false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        r9 = r0.getContext().getString(com.tencent.p014mm.C0966R.string.lnj);
        gy3.C87412m.m108593f(r9, "context.getString(com.te…g.bottom_bar_button_edit)");
        r0.addView(mo108350a(r9));
        r9 = r0.getContext().getString(com.tencent.p014mm.C0966R.string.lnk);
        gy3.C87412m.m108593f(r9, "context.getString(com.te…button_format_conversion)");
        r0.addView(mo108350a(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0074, code lost:
        if (r9.equals(com.tencent.xweb.FileReaderHelper.PPT_EXT) == false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0078, code lost:
        r9 = r0.getContext().getString(com.tencent.p014mm.C0966R.string.lnj);
        gy3.C87412m.m108593f(r9, "context.getString(com.te…g.bottom_bar_button_edit)");
        r0.addView(mo108350a(r9));
        r9 = r0.getContext().getString(com.tencent.p014mm.C0966R.string.lnl);
        gy3.C87412m.m108593f(r9, "context.getString(com.te…_button_full_screen_play)");
        r0.addView(mo108350a(r9));
        r9 = r0.getContext().getString(com.tencent.p014mm.C0966R.string.lnk);
        gy3.C87412m.m108593f(r9, "context.getString(com.te…button_format_conversion)");
        r0.addView(mo108350a(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0102, code lost:
        if (r9.equals(com.tencent.xweb.FileReaderHelper.DOC_EXT) == false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0105, code lost:
        r9 = r0.getContext().getString(com.tencent.p014mm.C0966R.string.lnj);
        gy3.C87412m.m108593f(r9, "context.getString(com.te…g.bottom_bar_button_edit)");
        r0.addView(mo108350a(r9));
        r9 = r0.getContext().getString(com.tencent.p014mm.C0966R.string.lnh);
        gy3.C87412m.m108593f(r9, "context.getString(com.te…_bar_button_adapt_screen)");
        r0.addView(mo108350a(r9));
        r9 = r0.getContext().getString(com.tencent.p014mm.C0966R.string.lnk);
        gy3.C87412m.m108593f(r9, "context.getString(com.te…button_format_conversion)");
        r0.addView(mo108350a(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0141, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.BottomBar", "fillClickLayout: wrong type :" + r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r9.equals(com.tencent.xweb.FileReaderHelper.XLSX_EXT) == false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        if (r9.equals(com.tencent.xweb.FileReaderHelper.PPTX_EXT) == false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r9.equals(com.tencent.xweb.FileReaderHelper.DOCX_EXT) != false) goto L_0x0105;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo108351b(java.lang.String r9) {
        /*
            r8 = this;
            android.widget.LinearLayout r0 = r8.f229731i
            if (r0 == 0) goto L_0x0157
            int r1 = r9.hashCode()
            java.lang.String r2 = "context.getString(com.te…_button_full_screen_play)"
            r3 = 2131822883(0x7f110923, float:1.927855E38)
            java.lang.String r4 = "context.getString(com.te…button_format_conversion)"
            r5 = 2131822882(0x7f110922, float:1.9278548E38)
            java.lang.String r6 = "context.getString(com.te…g.bottom_bar_button_edit)"
            r7 = 2131822881(0x7f110921, float:1.9278546E38)
            switch(r1) {
                case 99640: goto L_0x00fc;
                case 110834: goto L_0x00b0;
                case 111220: goto L_0x006d;
                case 118783: goto L_0x003c;
                case 3088960: goto L_0x0032;
                case 3447940: goto L_0x0027;
                case 3682393: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0141
        L_0x001c:
            java.lang.String r1 = "xlsx"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0047
            goto L_0x0141
        L_0x0027:
            java.lang.String r1 = "pptx"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0078
            goto L_0x0141
        L_0x0032:
            java.lang.String r1 = "docx"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0141
            goto L_0x0105
        L_0x003c:
            java.lang.String r1 = "xls"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0047
            goto L_0x0141
        L_0x0047:
            android.content.Context r9 = r0.getContext()
            java.lang.String r9 = r9.getString(r7)
            gy3.C87412m.m108593f(r9, r6)
            vd3.l r9 = r8.mo108350a(r9)
            r0.addView(r9)
            android.content.Context r9 = r0.getContext()
            java.lang.String r9 = r9.getString(r5)
            gy3.C87412m.m108593f(r9, r4)
            vd3.l r9 = r8.mo108350a(r9)
            r0.addView(r9)
            goto L_0x0157
        L_0x006d:
            java.lang.String r1 = "ppt"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0078
            goto L_0x0141
        L_0x0078:
            android.content.Context r9 = r0.getContext()
            java.lang.String r9 = r9.getString(r7)
            gy3.C87412m.m108593f(r9, r6)
            vd3.l r9 = r8.mo108350a(r9)
            r0.addView(r9)
            android.content.Context r9 = r0.getContext()
            java.lang.String r9 = r9.getString(r3)
            gy3.C87412m.m108593f(r9, r2)
            vd3.l r9 = r8.mo108350a(r9)
            r0.addView(r9)
            android.content.Context r9 = r0.getContext()
            java.lang.String r9 = r9.getString(r5)
            gy3.C87412m.m108593f(r9, r4)
            vd3.l r9 = r8.mo108350a(r9)
            r0.addView(r9)
            goto L_0x0157
        L_0x00b0:
            java.lang.String r1 = "pdf"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x00bb
            goto L_0x0141
        L_0x00bb:
            android.content.Context r9 = r0.getContext()
            java.lang.String r9 = r9.getString(r3)
            gy3.C87412m.m108593f(r9, r2)
            vd3.l r9 = r8.mo108350a(r9)
            r0.addView(r9)
            android.content.Context r9 = r0.getContext()
            r1 = 2131822885(0x7f110925, float:1.9278554E38)
            java.lang.String r9 = r9.getString(r1)
            java.lang.String r1 = "context.getString(com.te…g.bottom_bar_button_note)"
            gy3.C87412m.m108593f(r9, r1)
            vd3.l r9 = r8.mo108350a(r9)
            r0.addView(r9)
            android.content.Context r9 = r0.getContext()
            r1 = 2131822880(0x7f110920, float:1.9278544E38)
            java.lang.String r9 = r9.getString(r1)
            java.lang.String r1 = "context.getString(com.te…utton_convert_to_picture)"
            gy3.C87412m.m108593f(r9, r1)
            vd3.l r9 = r8.mo108350a(r9)
            r0.addView(r9)
            goto L_0x0157
        L_0x00fc:
            java.lang.String r1 = "doc"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0105
            goto L_0x0141
        L_0x0105:
            android.content.Context r9 = r0.getContext()
            java.lang.String r9 = r9.getString(r7)
            gy3.C87412m.m108593f(r9, r6)
            vd3.l r9 = r8.mo108350a(r9)
            r0.addView(r9)
            android.content.Context r9 = r0.getContext()
            r1 = 2131822879(0x7f11091f, float:1.9278542E38)
            java.lang.String r9 = r9.getString(r1)
            java.lang.String r1 = "context.getString(com.te…_bar_button_adapt_screen)"
            gy3.C87412m.m108593f(r9, r1)
            vd3.l r9 = r8.mo108350a(r9)
            r0.addView(r9)
            android.content.Context r9 = r0.getContext()
            java.lang.String r9 = r9.getString(r5)
            gy3.C87412m.m108593f(r9, r4)
            vd3.l r9 = r8.mo108350a(r9)
            r0.addView(r9)
            goto L_0x0157
        L_0x0141:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "fillClickLayout: wrong type :"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.String r0 = "MicroMsg.BottomBar"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r9)
        L_0x0157:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vd3.C78401j.mo108351b(java.lang.String):void");
    }

    public final String getContextId() {
        return this.f229729g;
    }

    public final String getFileExt() {
        return this.f229728f;
    }

    public final String getFileMd5() {
        return this.f229730h;
    }

    public final String getFileName() {
        return this.f229727e;
    }

    public final String getFilePath() {
        return this.f229726d;
    }

    public final void setFileType(String str) {
        C87412m.m108594g(str, "fileType");
        mo108351b(str);
    }
}
