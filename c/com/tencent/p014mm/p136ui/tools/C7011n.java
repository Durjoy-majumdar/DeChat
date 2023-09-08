package com.tencent.p014mm.p136ui.tools;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.p136ui.tools.C7013o;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.tools.n */
public class C7011n extends AsyncTask<Integer, Integer, Integer> {

    /* renamed from: a */
    public String f24749a;

    /* renamed from: b */
    public ProgressDialog f24750b;

    /* renamed from: c */
    public Uri f24751c;

    /* renamed from: d */
    public boolean f24752d;

    /* renamed from: e */
    public final /* synthetic */ Intent f24753e;

    /* renamed from: f */
    public final /* synthetic */ MMFragment f24754f;

    /* renamed from: g */
    public final /* synthetic */ String f24755g;

    /* renamed from: h */
    public final /* synthetic */ C7013o.C7017c f24756h;

    /* renamed from: i */
    public final /* synthetic */ Intent f24757i;

    /* renamed from: j */
    public final /* synthetic */ int f24758j;

    /* renamed from: com.tencent.mm.ui.tools.n$a */
    public class C7012a implements DialogInterface.OnCancelListener {
        public C7012a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C7011n.this.f24752d = true;
        }
    }

    public C7011n(Intent intent, MMFragment mMFragment, String str, C7013o.C7017c cVar, Intent intent2, int i) {
        this.f24753e = intent;
        this.f24754f = mMFragment;
        this.f24755g = str;
        this.f24756h = cVar;
        this.f24757i = intent2;
        this.f24758j = i;
    }

    public Object doInBackground(Object[] objArr) {
        Integer[] numArr = (Integer[]) objArr;
        try {
            Uri uri = this.f24751c;
            if (uri == null) {
                return null;
            }
            this.f24749a = C7013o.m7261c(this.f24755g, BitmapUtil.getBitmapNative(uri));
            return null;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AsyncObtainImage", e, "", new Object[0]);
            return null;
        }
    }

    public void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (!this.f24752d && !Util.isNullOrNil(this.f24749a)) {
            C7013o.C7017c cVar = this.f24756h;
            if (cVar != null) {
                this.f24757i.putExtra("CropImage_OutputPath", cVar.mo8052a(this.f24749a));
            }
            this.f24757i.putExtra("CropImage_ImgPath", this.f24749a);
            this.f24754f.startActivityForResult(this.f24757i, this.f24758j);
        }
        this.f24750b.dismiss();
    }

    public void onPreExecute() {
        try {
            this.f24751c = this.f24753e.getData();
            this.f24752d = false;
            this.f24750b = C76879j.m92723Q(this.f24754f.getContext(), this.f24754f.getString(C0966R.string.a3h), this.f24754f.getString(C0966R.string.f8025zl), true, true, new C7012a());
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AsyncObtainImage", e, "", new Object[0]);
        }
    }
}
