package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.graphics.Bitmap;
import com.tencent.p014mm.choosemsgfile.compat.MsgFile;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.ArrayList;
import java.util.Iterator;
import js0.C88024r;
import js0.C9514m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p775zi.C79332c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.y0 */
public class C82779y0 implements C79332c.C79333a {

    /* renamed from: a */
    public final /* synthetic */ C82554k f242132a;

    /* renamed from: b */
    public final /* synthetic */ int f242133b;

    /* renamed from: c */
    public final /* synthetic */ C82783z0 f242134c;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.y0$a */
    public class C82780a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f242135d;

        public C82780a(ArrayList arrayList) {
            this.f242135d = arrayList;
        }

        public void run() {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f242135d.iterator();
            while (it.hasNext()) {
                MsgFile msgFile = (MsgFile) it.next();
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (Util.isNullOrNil(msgFile.f237616e) || !C86013q1.m106450k(msgFile.f237616e)) {
                        Log.m105921e("MicroMsg.JsApiChooseMessageFile", "msgFile:%s is not exist", msgFile.f237616e);
                    } else {
                        if ("image".equals(msgFile.f237619h)) {
                            int exifOrientation = BackwardSupportUtil.ExifHelper.getExifOrientation(msgFile.f237616e);
                            if (exifOrientation != 0) {
                                C86009m1 allocTempFile = C82779y0.this.f242132a.getFileSystem().allocTempFile(msgFile.f237617f);
                                if (allocTempFile != null) {
                                    boolean rotate = BitmapUtil.rotate(msgFile.f237616e, exifOrientation, "png".equals(msgFile.f237620i) ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 100, allocTempFile.mo119971i());
                                    if (rotate) {
                                        msgFile.f237616e = allocTempFile.mo119971i();
                                        msgFile.f237615d = (int) allocTempFile.mo119980r();
                                    }
                                    Log.m105925i("MicroMsg.JsApiChooseMessageFile", "isOk:%b degree:%d msgFile:%s", Boolean.valueOf(rotate), Integer.valueOf(exifOrientation), msgFile);
                                } else {
                                    Log.m105920e("MicroMsg.JsApiChooseMessageFile", "allocTempFile failed");
                                }
                            }
                            C1732c2.m1781a(msgFile.f237616e);
                        }
                        C86009m1 m1Var = new C86009m1(msgFile.f237616e);
                        C9514m mVar = new C9514m();
                        C81410b0 createTempFileFrom = C82779y0.this.f242132a.getFileSystem().createTempFileFrom(m1Var, msgFile.f237620i, false, mVar);
                        if (createTempFileFrom == C81410b0.OK) {
                            jSONObject.put("path", mVar.f29691a);
                            jSONObject.put("name", msgFile.f237617f);
                            jSONObject.put("size", msgFile.f237615d);
                            jSONObject.put("type", msgFile.f237619h);
                            jSONObject.put("time", msgFile.f237618g);
                            jSONArray.put(jSONObject);
                        } else {
                            Log.m105921e("MicroMsg.JsApiChooseMessageFile", "msgFile:%s result:%s", msgFile, createTempFileFrom);
                        }
                    }
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.JsApiChooseMessageFile", e, "", new Object[0]);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errMsg", C82779y0.this.f242134c.mo114779e() + ":ok");
                jSONObject2.put("tempFiles", jSONArray);
            } catch (JSONException e2) {
                Log.printErrStackTrace("MicroMsg.JsApiChooseMessageFile", e2, "", new Object[0]);
            }
            Log.m105925i("MicroMsg.JsApiChooseMessageFile", "chooseMessageFile:%s", jSONObject2.toString());
            C82779y0 y0Var = C82779y0.this;
            y0Var.f242132a.mo109647a(y0Var.f242133b, jSONObject2.toString());
        }
    }

    public C82779y0(C82783z0 z0Var, C82554k kVar, int i) {
        this.f242134c = z0Var;
        this.f242132a = kVar;
        this.f242133b = i;
    }

    /* renamed from: a */
    public void mo104148a(int i, String str, ArrayList<MsgFile> arrayList) {
        Log.m105925i("MicroMsg.JsApiChooseMessageFile", "resultCode:%d filePaths:%s", Integer.valueOf(i), arrayList);
        if (i == -1) {
            C88024r.m109571a().postToWorker(new C82780a(arrayList));
        } else if (i == 0) {
            this.f242132a.mo109647a(this.f242133b, this.f242134c.mo115109j("fail:cancel"));
        } else if (i == 1) {
            if (Util.isNullOrNil(str)) {
                this.f242132a.mo109647a(this.f242133b, this.f242134c.mo115109j("fail"));
                return;
            }
            C82554k kVar = this.f242132a;
            int i2 = this.f242133b;
            C82783z0 z0Var = this.f242134c;
            kVar.mo109647a(i2, z0Var.mo115109j("fail:" + str));
        }
    }
}
