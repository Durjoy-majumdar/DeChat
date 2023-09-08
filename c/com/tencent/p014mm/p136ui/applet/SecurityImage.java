package com.tencent.p014mm.p136ui.applet;

import al3.C0086a;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C77389a;
import qo3.C77398g;

/* renamed from: com.tencent.mm.ui.applet.SecurityImage */
public class SecurityImage extends LinearLayout {

    /* renamed from: p */
    public static final /* synthetic */ int f348162p = 0;

    /* renamed from: d */
    public String f348163d = null;

    /* renamed from: e */
    public String f348164e = null;

    /* renamed from: f */
    public int f348165f = 0;

    /* renamed from: g */
    public ProgressBar f348166g = null;

    /* renamed from: h */
    public ImageView f348167h = null;

    /* renamed from: i */
    public Button f348168i = null;

    /* renamed from: j */
    public EditText f348169j = null;

    /* renamed from: n */
    public C77398g f348170n = null;

    /* renamed from: o */
    public C116049b f348171o;

    /* renamed from: com.tencent.mm.ui.applet.SecurityImage$a */
    public static class C116047a {

        /* renamed from: com.tencent.mm.ui.applet.SecurityImage$a$a */
        public class C116048a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ SecurityImage f348172d;

            /* renamed from: e */
            public final /* synthetic */ DialogInterface.OnClickListener f348173e;

            public C116048a(SecurityImage securityImage, DialogInterface.OnClickListener onClickListener) {
                this.f348172d = securityImage;
                this.f348173e = onClickListener;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                this.f348172d.getClass();
                this.f348173e.onClick(dialogInterface, i);
            }
        }

        /* renamed from: a */
        public static SecurityImage m163296a(Context context, int i, int i2, byte[] bArr, String str, String str2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnDismissListener onDismissListener, C116049b bVar) {
            SecurityImage securityImage = (SecurityImage) View.inflate(context, C0966R.C0971layout.bvo, (ViewGroup) null);
            securityImage.setNetworkModel(bVar);
            securityImage.f348166g = (ProgressBar) securityImage.findViewById(C0966R.C0970id.ijn);
            securityImage.f348167h = (ImageView) securityImage.findViewById(C0966R.C0970id.a0q);
            securityImage.f348168i = (Button) securityImage.findViewById(C0966R.C0970id.a0o);
            securityImage.f348169j = (EditText) securityImage.findViewById(C0966R.C0970id.a0p);
            securityImage.f348168i.setOnClickListener(new C116050a(securityImage));
            C116049b bVar2 = securityImage.f348171o;
            if (bVar2 != null) {
                bVar2.mo93942b();
            }
            securityImage.mo177230b(i2, bArr, str, str2);
            C77389a aVar = new C77389a();
            aVar.f225644a = C0086a.m38a(context).getString(i);
            aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.f7935ws);
            aVar.f225620C = new C116048a(securityImage, onClickListener);
            aVar.f225622E = onCancelListener;
            aVar.f225627J = securityImage;
            aVar.f225668y = true;
            C77398g gVar = new C77398g(context, C0966R.style.a66);
            gVar.mo107525e(aVar);
            securityImage.f348170n = gVar;
            gVar.setOnDismissListener(onDismissListener);
            securityImage.f348170n.show();
            return securityImage;
        }
    }

    /* renamed from: com.tencent.mm.ui.applet.SecurityImage$b */
    public static abstract class C116049b {

        /* renamed from: a */
        public SecurityImage f348174a;

        /* renamed from: a */
        public abstract void mo93941a();

        /* renamed from: b */
        public abstract void mo93942b();
    }

    public SecurityImage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo177229a(boolean z) {
        this.f348167h.setAlpha(z ? 255 : 40);
        int i = 0;
        this.f348167h.setBackgroundColor(z ? 0 : -5592406);
        ProgressBar progressBar = this.f348166g;
        if (z) {
            i = 4;
        }
        progressBar.setVisibility(i);
    }

    /* renamed from: b */
    public void mo177230b(int i, byte[] bArr, String str, String str2) {
        mo177229a(true);
        this.f348163d = str;
        this.f348164e = str2;
        this.f348165f = i;
        Bitmap decodeByteArray = BitmapUtil.decodeByteArray(bArr);
        if (decodeByteArray != null) {
            Log.m105925i("MicroMsg.SecurityImage", "dkwt setSecImg sid:%s key:%s imgBuf:%d [%d %d]", str, str2, Integer.valueOf(bArr.length), Integer.valueOf(decodeByteArray.getWidth()), Integer.valueOf(decodeByteArray.getHeight()));
            this.f348163d = str;
            this.f348164e = str2;
            this.f348165f = i;
            this.f348167h.setImageBitmap(decodeByteArray);
            return;
        }
        Object[] objArr = new Object[3];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = Integer.valueOf(bArr == null ? -1 : bArr.length);
        Log.m105921e("MicroMsg.SecurityImage", "dkwt setSecImg ERROR sid:%s key:%s imgBuf:%d", objArr);
    }

    public int getSecCodeType() {
        return this.f348165f;
    }

    public String getSecImgCode() {
        EditText editText = this.f348169j;
        return editText == null ? "" : editText.getText().toString().trim();
    }

    public String getSecImgEncryptKey() {
        return this.f348164e;
    }

    public String getSecImgSid() {
        return this.f348163d;
    }

    public void setNetworkModel(C116049b bVar) {
        C116049b bVar2 = this.f348171o;
        if (bVar2 != null) {
            bVar2.f348174a = null;
        }
        this.f348171o = bVar;
        bVar.f348174a = this;
    }
}
