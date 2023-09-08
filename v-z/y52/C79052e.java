package y52;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.masssend.p076ui.MassSendMsgUI;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76879j;
import qo3.C77398g;

/* renamed from: y52.e */
public class C79052e implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ MassSendMsgUI f232148d;

    /* renamed from: y52.e$a */
    public class C79053a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f232149d;

        public C79053a(String str) {
            this.f232149d = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.putExtra("CropImage_OutputPath", this.f232149d);
            MassSendMsgUI massSendMsgUI = C79052e.this.f232148d;
            String str = MassSendMsgUI.f201430r;
            massSendMsgUI.mo96024I7(intent);
        }
    }

    public C79052e(MassSendMsgUI massSendMsgUI) {
        this.f232148d = massSendMsgUI;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String valueOf = String.valueOf(charSequence);
        int i4 = i3 + i;
        String substring = valueOf.substring(i, i4);
        C77398g gVar = this.f232148d.f201439o;
        if ((gVar == null || !gVar.isShowing()) && ImgUtil.isImgFile(substring)) {
            Bitmap extractThumbNail = BitmapUtil.extractThumbNail(substring, 300, 300, false);
            if (extractThumbNail == null) {
                Log.m105920e("MicroMsg.MassSendMsgUI", "showAlert fail, bmp is null");
                return;
            }
            ImageView imageView = new ImageView(this.f232148d);
            imageView.setImageBitmap(extractThumbNail);
            int dimensionPixelSize = this.f232148d.getResources().getDimensionPixelSize(C0966R.dimen.f3895i6);
            imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            MassSendMsgUI massSendMsgUI = this.f232148d;
            massSendMsgUI.f201439o = C76879j.m92747r(massSendMsgUI, massSendMsgUI.getString(C0966R.string.bbr), imageView, this.f232148d.getString(C0966R.string.a18), this.f232148d.getString(C0966R.string.f7926wf), new C79053a(substring), (DialogInterface.OnClickListener) null);
            String str = valueOf.substring(0, i) + valueOf.substring(i4);
            this.f232148d.f201433f.mo100352G0(str, -1, false);
            MassSendMsgUI.f201430r = str;
        }
    }
}
