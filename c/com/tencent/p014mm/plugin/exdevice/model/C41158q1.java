package com.tencent.p014mm.plugin.exdevice.model;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SendAppMsgEvent;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.opensdk.modelmsg.WXImageObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import d62.C75339i;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import gc0.C20828a;
import ic0.C21070h;
import java.io.IOException;
import java.util.List;
import jc0.C21210b;
import kg3.C76577a;
import nj3.C76879j;
import p196ln.C76705f;
import p227rn.C48054w;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.exdevice.model.q1 */
public class C41158q1 {

    /* renamed from: a */
    public Context f110881a;

    /* renamed from: b */
    public int f110882b;

    /* renamed from: c */
    public View f110883c;

    /* renamed from: d */
    public TextView f110884d;

    /* renamed from: e */
    public TextView f110885e;

    /* renamed from: f */
    public TextView f110886f;

    /* renamed from: g */
    public TextView f110887g;

    /* renamed from: h */
    public TextView f110888h;

    /* renamed from: i */
    public View f110889i;

    /* renamed from: j */
    public boolean f110890j;

    /* renamed from: k */
    public boolean f110891k;

    /* renamed from: l */
    public Dialog f110892l;

    /* renamed from: com.tencent.mm.plugin.exdevice.model.q1$a */
    public class C41159a implements DialogInterface.OnCancelListener {
        public C41159a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C41158q1.this.f110891k = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.model.q1$b */
    public class C41160b implements C21070h {

        /* renamed from: a */
        public final /* synthetic */ C41162d f110894a;

        /* renamed from: com.tencent.mm.plugin.exdevice.model.q1$b$a */
        public class C41161a implements Runnable {
            public C41161a() {
            }

            public void run() {
                if (C41158q1.this.f110892l.isShowing()) {
                    C41158q1.this.f110892l.dismiss();
                }
            }
        }

        public C41160b(C41162d dVar) {
            this.f110894a = dVar;
        }

        /* renamed from: a */
        public void mo6676a(String str, View view) {
        }

        /* renamed from: b */
        public void mo6677b(String str, View view, C21210b bVar) {
            C41158q1 q1Var = C41158q1.this;
            if (q1Var.f110891k) {
                q1Var.f110890j = false;
                return;
            }
            MMHandlerThread.postToMainThread(new C41161a());
            this.f110894a.mo64226a(C41158q1.this.mo64222a(bVar.f59988d));
            C41158q1.this.f110890j = false;
        }

        /* renamed from: c */
        public Bitmap mo6678c(String str, View view, C21210b bVar) {
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.model.q1$d */
    public interface C41162d {
        /* renamed from: a */
        void mo64226a(String str);
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.model.q1$c */
    public class C41163c extends ShapeDrawable.ShaderFactory {

        /* renamed from: a */
        public final /* synthetic */ int[] f110897a;

        public C41163c(C41158q1 q1Var, int[] iArr) {
            this.f110897a = iArr;
        }

        public Shader resize(int i, int i2) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, (float) i2, new int[]{0, this.f110897a[0]}, new float[]{0.0f, 1.0f}, Shader.TileMode.REPEAT);
        }
    }

    /* renamed from: c */
    public static boolean m44600c(Context context, String str, String str2, String str3, String str4) {
        List<String> cj02 = ((C48054w) C86312j.m106911c(C48054w.class)).cj0(1);
        String str5 = (cj02 == null || cj02.size() <= 0) ? null : cj02.get(0);
        WXImageObject wXImageObject = new WXImageObject();
        wXImageObject.setImagePath(str2);
        String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str5);
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXImageObject;
        wXMediaMessage.title = displayName;
        wXMediaMessage.description = str4;
        wXMediaMessage.setThumbImage(BitmapUtil.decodeFile(str2, (BitmapFactory.Options) null));
        SendAppMsgEvent sendAppMsgEvent = new SendAppMsgEvent();
        SendAppMsgEvent.C1131a aVar = sendAppMsgEvent.f9477d;
        aVar.f9478a = wXMediaMessage;
        aVar.f9479b = "wx7fa037cc7dfabad5";
        aVar.f9480c = context.getString(C0966R.string.cgc);
        SendAppMsgEvent.C1131a aVar2 = sendAppMsgEvent.f9477d;
        aVar2.f9481d = str;
        aVar2.f9482e = 2;
        if (Util.isNullOrNil(str5)) {
            sendAppMsgEvent.f9477d.f9485h = null;
        } else {
            SendAppMsgEvent.C1131a aVar3 = sendAppMsgEvent.f9477d;
            aVar3.f9483f = str5;
            aVar3.f9484g = displayName;
        }
        boolean publish = sendAppMsgEvent.publish();
        if (!Util.isNullOrNil(str3)) {
            SendMsgEvent sendMsgEvent = new SendMsgEvent();
            SendMsgEvent.C1132a aVar4 = sendMsgEvent.f9496d;
            aVar4.f9497a = str;
            aVar4.f9498b = str3;
            aVar4.f9499c = C45628s0.m50810y(str);
            sendMsgEvent.f9496d.f9500d = 0;
            sendMsgEvent.publish();
        }
        return publish;
    }

    /* renamed from: a */
    public final String mo64222a(Bitmap bitmap) {
        int[] c = bitmap != null ? C85875k4.m106174c(bitmap, 4, 4) : new int[]{-1, -16777216};
        C41163c cVar = new C41163c(this, c);
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(cVar);
        this.f110889i.setBackgroundDrawable(paintDrawable);
        this.f110884d.setTextColor(c[1]);
        this.f110885e.setTextColor(c[1]);
        this.f110886f.setTextColor(c[1]);
        this.f110887g.setTextColor(c[1]);
        this.f110888h.setTextColor(c[1]);
        int i = this.f110882b;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        this.f110883c.draw(new Canvas(createBitmap));
        C86009m1 m1Var = new C86009m1(new C86009m1(this.f110881a.getCacheDir(), "sport_share_bitmap.jpg").mo119971i());
        if (m1Var.mo119967g()) {
            m1Var.mo119966f();
        }
        try {
            BitmapUtil.saveBitmapToImage(createBitmap, 100, Bitmap.CompressFormat.JPEG, m1Var.mo119971i(), true);
        } catch (IOException unused) {
        }
        return m1Var.mo119971i();
    }

    /* renamed from: b */
    public void mo64223b(Context context, String str, String str2, String str3, C41162d dVar) {
        if (!this.f110890j) {
            this.f110890j = true;
            this.f110891k = false;
            if (this.f110892l == null && !Util.isNullOrNil(str3)) {
                C89779i0 Q = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(C0966R.string.cfs), true, true, new C41159a());
                this.f110892l = Q;
                Q.show();
            }
            this.f110881a = context;
            this.f110882b = 1280;
            if (1280 > C76577a.m92145A(context)) {
                this.f110882b = C76577a.m92145A(context);
            }
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.a54, (ViewGroup) null);
            this.f110883c = inflate;
            this.f110884d = (TextView) inflate.findViewById(C0966R.C0970id.cml);
            this.f110885e = (TextView) this.f110883c.findViewById(C0966R.C0970id.cmj);
            this.f110886f = (TextView) this.f110883c.findViewById(C0966R.C0970id.cms);
            this.f110888h = (TextView) this.f110883c.findViewById(C0966R.C0970id.h_d);
            this.f110887g = (TextView) this.f110883c.findViewById(C0966R.C0970id.cmr);
            this.f110889i = this.f110883c.findViewById(C0966R.C0970id.a8m);
            this.f110884d.setText(str);
            this.f110886f.setText(str2);
            ((C76705f) C86312j.m106911c(C76705f.class)).D20((ImageView) this.f110883c.findViewById(C0966R.C0970id.a1q), C75592q0.m90789s(), 0.5f);
            ImageView imageView = (ImageView) this.f110883c.findViewById(C0966R.C0970id.a8b);
            this.f110883c.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f110883c.measure(View.MeasureSpec.makeMeasureSpec(this.f110882b, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f110882b, 1073741824));
            View view = this.f110883c;
            int i = this.f110882b;
            view.layout(0, 0, i, i);
            if (!Util.isNullOrNil(str3)) {
                if (C41166r1.wx0().f110913t == null) {
                    C41166r1.wx0().f110913t = C20828a.m22825b();
                }
                C41166r1.wx0().f110913t.mo32524m(str3, imageView, new C41160b(dVar));
                return;
            }
            imageView.setImageResource(C0966R.color.f3281m3);
            dVar.mo64226a(mo64222a((Bitmap) null));
            this.f110890j = false;
        }
    }
}
