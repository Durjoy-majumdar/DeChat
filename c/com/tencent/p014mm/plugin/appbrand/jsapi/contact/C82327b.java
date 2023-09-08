package com.tencent.p014mm.plugin.appbrand.jsapi.contact;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.contact.C82324a;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import org.json.JSONObject;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.b */
public class C82327b extends C82268c {
    public static final int CTRL_INDEX = 226;
    public static final String NAME = "addPhoneContact";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.b$a */
    public class C82328a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f241285d;

        /* renamed from: e */
        public final /* synthetic */ C82324a f241286e;

        /* renamed from: f */
        public final /* synthetic */ C82381f f241287f;

        /* renamed from: g */
        public final /* synthetic */ int f241288g;

        public C82328a(Context context, C82324a aVar, C82381f fVar, int i) {
            this.f241285d = context;
            this.f241286e = aVar;
            this.f241287f = fVar;
            this.f241288g = i;
        }

        public void run() {
            C82327b bVar = C82327b.this;
            Activity activity = (Activity) this.f241285d;
            C82324a aVar = this.f241286e;
            C82381f fVar = this.f241287f;
            int i = this.f241288g;
            bVar.getClass();
            String[] strArr = {activity.getString(C0966R.string.gkv), activity.getString(C0966R.string.gku)};
            C77407n nVar = new C77407n((Context) activity, 1, false);
            nVar.f225771i = new C82329c(bVar, strArr);
            nVar.f225782p = new C82330d(bVar, aVar, activity, fVar, i);
            nVar.mo107573q();
        }
    }

    /* renamed from: w */
    public static void m101071w(C82327b bVar, Intent intent, C82324a aVar, Activity activity, C82381f fVar) {
        Bitmap createScaledBitmap;
        bVar.getClass();
        intent.setFlags(268435456);
        ArrayList arrayList = new ArrayList();
        C82324a.C82326b bVar2 = aVar.f241259a;
        StringBuilder sb = new StringBuilder();
        if (Util.isChinese(bVar2.f241282a) || Util.isChinese(bVar2.f241283b) || Util.isChinese(bVar2.f241284c)) {
            if (bVar2.f241284c.trim().length() > 0) {
                sb.append(bVar2.f241284c);
            }
            if (bVar2.f241283b.trim().length() > 0) {
                sb.append(bVar2.f241283b);
            }
            if (bVar2.f241282a.trim().length() > 0) {
                sb.append(bVar2.f241282a);
            }
        } else {
            if (bVar2.f241282a.trim().length() > 0) {
                sb.append(bVar2.f241282a);
            }
            if (bVar2.f241283b.trim().length() > 0) {
                sb.append(" ");
                sb.append(bVar2.f241283b);
            }
            if (bVar2.f241284c.trim().length() > 0) {
                sb.append(" ");
                sb.append(bVar2.f241284c);
            }
        }
        String sb4 = sb.toString();
        if (!Util.isNullOrNil(sb4)) {
            intent.putExtra("name", sb4);
        } else {
            Log.m105920e("MicroMsg.JsApiAddPhoneContact", "no contact user name");
        }
        if (!Util.isNullOrNil(aVar.f241260b)) {
            String str = aVar.f241260b;
            ContentValues contentValues = new ContentValues();
            contentValues.put("mimetype", "vnd.android.cursor.item/nickname");
            contentValues.put("data1", str);
            contentValues.put("data2", 1);
            arrayList.add(contentValues);
        }
        if (!Util.isNullOrNil(aVar.f241271m)) {
            String str2 = aVar.f241271m;
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("mimetype", "vnd.android.cursor.item/note");
            contentValues2.put("data1", str2);
            arrayList.add(contentValues2);
        }
        if (!Util.isNullOrNil(aVar.f241273o) || !Util.isNullOrNil(aVar.f241270l)) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("mimetype", "vnd.android.cursor.item/organization");
            if (!Util.isNullOrNil(aVar.f241273o)) {
                contentValues3.put("data1", aVar.f241273o);
            }
            if (!Util.isNullOrNil(aVar.f241270l)) {
                contentValues3.put("data4", aVar.f241270l);
            }
            contentValues3.put("data2", 1);
            arrayList.add(contentValues3);
        }
        if (!Util.isNullOrNil(aVar.f241272n)) {
            String str3 = aVar.f241272n;
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put("mimetype", "vnd.android.cursor.item/website");
            contentValues4.put("data1", str3);
            contentValues4.put("data2", 1);
            arrayList.add(contentValues4);
        }
        if (!Util.isNullOrNil(aVar.f241269k)) {
            intent.putExtra(Scopes.EMAIL, aVar.f241269k);
        }
        if (!Util.isNullOrNil(aVar.f241265g)) {
            bVar.mo114720y(arrayList, aVar.f241265g, 2);
        }
        if (!Util.isNullOrNil(aVar.f241266h)) {
            bVar.mo114720y(arrayList, aVar.f241266h, 1);
        }
        if (!Util.isNullOrNil(aVar.f241268j)) {
            bVar.mo114720y(arrayList, aVar.f241268j, 3);
        }
        if (!Util.isNullOrNil(aVar.f241267i)) {
            bVar.mo114720y(arrayList, aVar.f241267i, 10);
        }
        if (!Util.isNullOrNil(aVar.f241275q)) {
            bVar.mo114720y(arrayList, aVar.f241275q, 5);
        }
        if (!Util.isNullOrNil(aVar.f241274p)) {
            bVar.mo114720y(arrayList, aVar.f241274p, 4);
        }
        bVar.mo114719x(arrayList, aVar.f241264f, 3);
        bVar.mo114719x(arrayList, aVar.f241263e, 2);
        bVar.mo114719x(arrayList, aVar.f241262d, 1);
        if (!Util.isNullOrNil(aVar.f241276r)) {
            String str4 = aVar.f241276r;
            String string = activity.getString(C0966R.string.n6d);
            ContentValues contentValues5 = new ContentValues();
            contentValues5.put("mimetype", "vnd.android.cursor.item/im");
            contentValues5.put("data1", str4);
            contentValues5.put("data5", -1);
            contentValues5.put("data6", string);
            arrayList.add(contentValues5);
        }
        C86009m1 absoluteFile = fVar.getFileSystem().getAbsoluteFile(aVar.f241261c);
        if (absoluteFile != null && absoluteFile.mo119967g()) {
            try {
                Bitmap c = MMBitmapFactory.m98734c(absoluteFile.mo119971i());
                if (c != null) {
                    if (c.getByteCount() > 819200) {
                        while (true) {
                            createScaledBitmap = Bitmap.createScaledBitmap(c, c.getWidth() / 2, c.getHeight() / 2, false);
                            try {
                                c.recycle();
                            } catch (Throwable unused) {
                            }
                            if (createScaledBitmap == null) {
                                break;
                            } else if (createScaledBitmap.getByteCount() <= 819200) {
                                break;
                            } else {
                                c = createScaledBitmap;
                            }
                        }
                        c = createScaledBitmap;
                    }
                    if (c != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        c.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        ContentValues contentValues6 = new ContentValues();
                        contentValues6.put("mimetype", "vnd.android.cursor.item/photo");
                        contentValues6.put("data15", byteArray);
                        arrayList.add(contentValues6);
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th) {
                            Log.printErrStackTrace("MicroMsg.JsApiAddPhoneContact", th, "processContactIntent, close avatar stream", new Object[0]);
                        }
                        try {
                            c.recycle();
                        } catch (Throwable unused2) {
                        }
                    }
                }
            } catch (OutOfMemoryError unused3) {
                Log.m105921e("MicroMsg.JsApiAddPhoneContact", "processContactIntent, put avatar bitmap oom, file=%s", absoluteFile);
            }
        }
        intent.putParcelableArrayListExtra("data", arrayList);
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (jSONObject == null) {
            fVar.mo109647a(i, mo115109j("fail:data is null"));
            Log.m105920e("MicroMsg.JsApiAddPhoneContact", "data is null");
        } else if (Util.isNullOrNil(jSONObject.optString("firstName"))) {
            fVar.mo109647a(i, mo115109j("fail:firstName is null"));
            Log.m105920e("MicroMsg.JsApiAddPhoneContact", "firstName is null");
        } else {
            Context context = fVar.getContext();
            if (context == null || !(context instanceof Activity)) {
                fVar.mo109647a(i, mo115109j("fail"));
                Log.m105920e("MicroMsg.JsApiAddPhoneContact", "activity is null, invoke fail!");
                return;
            }
            C82324a aVar = new C82324a();
            aVar.f241261c = jSONObject.optString("photoFilePath");
            aVar.f241260b = jSONObject.optString("nickName");
            aVar.f241259a = new C82324a.C82326b(jSONObject.optString("firstName"), jSONObject.optString("middleName"), jSONObject.optString("lastName"));
            aVar.f241271m = jSONObject.optString("remark");
            aVar.f241265g = jSONObject.optString("mobilePhoneNumber");
            aVar.f241276r = jSONObject.optString("weChatNumber");
            aVar.f241264f = mo114721z(jSONObject, "address");
            aVar.f241273o = jSONObject.optString("organization");
            aVar.f241270l = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            aVar.f241274p = jSONObject.optString("workFaxNumber");
            aVar.f241268j = jSONObject.optString("workPhoneNumber");
            aVar.f241267i = jSONObject.optString("hostNumber");
            aVar.f241269k = jSONObject.optString(Scopes.EMAIL);
            aVar.f241272n = jSONObject.optString("url");
            aVar.f241263e = mo114721z(jSONObject, "workAddress");
            aVar.f241275q = jSONObject.optString("homeFaxNumber");
            aVar.f241266h = jSONObject.optString("homePhoneNumber");
            aVar.f241262d = mo114721z(jSONObject, "homeAddress");
            fVar.mo109673t(new C82328a(context, aVar, fVar, i));
        }
    }

    /* renamed from: x */
    public final void mo114719x(ArrayList<ContentValues> arrayList, C82324a.C82325a aVar, int i) {
        if (aVar != null && aVar.mo114718a().length() > 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("mimetype", "vnd.android.cursor.item/postal-address_v2");
            contentValues.put("data1", aVar.mo114718a());
            contentValues.put("data9", aVar.f241281e);
            contentValues.put("data2", Integer.valueOf(i));
            arrayList.add(contentValues);
        }
    }

    /* renamed from: y */
    public final void mo114720y(ArrayList<ContentValues> arrayList, String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
        contentValues.put("data1", str);
        contentValues.put("data2", Integer.valueOf(i));
        arrayList.add(contentValues);
    }

    /* renamed from: z */
    public final C82324a.C82325a mo114721z(JSONObject jSONObject, String str) {
        String optString = jSONObject.optString(str + "Country");
        String optString2 = jSONObject.optString(str + "State");
        String optString3 = jSONObject.optString(str + "City");
        String optString4 = jSONObject.optString(str + "Street");
        return new C82324a.C82325a(optString, optString2, optString3, optString4, jSONObject.optString(str + "PostalCode"));
    }
}
