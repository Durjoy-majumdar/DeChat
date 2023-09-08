package com.tencent.p014mm.storage;

import android.content.ContentValues;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.api.QueryImageData;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.Sql;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import gy3.C24560g0;
import gy3.C87412m;
import i40.C60247c;
import ig3.C60283e;
import java.util.ArrayList;
import java.util.List;
import p157gk.C32466a;
import p749xh.C38632p1;
import p749xh.C66267j1;
import sx3.C26236u;

/* renamed from: com.tencent.mm.storage.a4 */
public final class C57593a4 {

    /* renamed from: a */
    public static final C57593a4 f164912a = new C57593a4();

    /* renamed from: a */
    public final void mo81936a() {
        C39622i0 a;
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_IMAGE_QUERY_DATA_DB_VERSION_INT;
        Object f = i.mo119685f(aVar, 0);
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) f).intValue();
        StringBuilder sb = new StringBuilder();
        sb.append(C86709a0.m107535s().f251807e + "mediaOpt/imageQuery/dbFolder/");
        sb.append("image_query_table.db");
        String sb4 = sb.toString();
        C60283e.f171886i = (long) intValue;
        if (intValue != 2) {
            Log.m105924i("MicroMsg.ImageQueryStorage", "diff sql version， delete sql file, " + intValue + ", 2");
            StringBuilder sb5 = new StringBuilder();
            sb5.append(C86709a0.m107535s().f251807e);
            sb5.append("mediaOpt/imageQuery/dbFolder/");
            C86013q1.m106445f(sb5.toString());
            C60283e.f171887j = (long) 1;
        } else {
            C60283e.f171887j = (long) 2;
        }
        Class cls = C57604w3.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        if (((C57604w3) a).mo85232c3(sb4)) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 2);
        }
    }

    /* renamed from: b */
    public final void mo81937b(String str) {
        C39622i0 a;
        C87412m.m108594g(str, "scanPath");
        Log.m105924i("MicroMsg.ImageQueryStorage", "deleteImageByScanPath >> " + str);
        Class cls = C57604w3.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        C57603t1 t1Var = (C57603t1) ((C57604w3) a).mo85233d3(C57603t1.class);
        Log.m105924i("MicroMsg.ClsLabelInfoStorage", "deleteClsByScanImagePath >> " + str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("hd_image_path", str);
        C57602s1 s1Var = (C57602s1) t1Var.get(contentValues, C24560g0.m30725a(C57602s1.class));
        int delete$default = s1Var != null ? MvvmStorage.delete$default(t1Var, s1Var, false, false, 4, (Object) null) : 0;
        Log.m105924i("MicroMsg.ImageQueryStorage", "deleteImageByScanPath >> " + delete$default);
    }

    /* renamed from: c */
    public final boolean mo81938c(QueryImageData queryImageData, String str) {
        C39622i0 a;
        C87412m.m108594g(queryImageData, "imageData");
        C87412m.m108594g(str, "chatRoomId");
        C57602s1 s1Var = new C57602s1();
        s1Var.field_chat_room_id = str;
        s1Var.field_hd_image_path = queryImageData.f154725f;
        s1Var.field_timestamp = queryImageData.f154724e;
        s1Var.field_origin_image_path = queryImageData.f154726g;
        String str2 = queryImageData.f154727h;
        s1Var.field_crop_label_id = str2;
        s1Var.field_ocr_result = queryImageData.f154729j;
        s1Var.field_is_recognize = "0";
        s1Var.field_label_id = str2;
        s1Var.field_msg_id = queryImageData.f154723d;
        Class cls = C57604w3.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        boolean insert$default = MvvmStorage.insert$default(((C57604w3) a).mo85233d3(C57603t1.class), s1Var, false, false, false, 14, (Object) null);
        Log.m105924i("MicroMsg.ImageQueryStorage", "insertCustomClsInfo >> " + queryImageData.f154726g + " result: " + insert$default);
        return insert$default;
    }

    /* renamed from: d */
    public final ArrayList<QueryImageData> mo81939d(String str, String str2) {
        C39622i0 a;
        C87412m.m108594g(str, "roomId");
        C87412m.m108594g(str2, "isRes");
        Class cls = C57604w3.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        List<C57602s1> multiQuery = C66267j1.f190595p.selectAll().log("MicroMsg.ClsLabelInfoStorage").where(new Sql.Equal("chat_room_id", str).and(new Sql.Equal("is_recognize", str2))).orderBy((List<? extends ISqlOrder>) C26236u.m33719b(C66267j1.f190596q.orderDesc())).build().multiQuery(((C57603t1) ((C57604w3) a).mo85233d3(C57603t1.class)).getDbProvider().getDB(), C57602s1.class);
        Log.m105924i("MicroMsg.ClsLabelInfoStorage", "getClsImageListByIsRec select result: " + multiQuery.size());
        Log.m105924i("MicroMsg.ImageQueryStorage", "selectAllOldNoRecData >> " + str + ' ' + multiQuery.size());
        ArrayList<QueryImageData> arrayList = new ArrayList<>();
        for (C57602s1 s1Var : multiQuery) {
            arrayList.add(new QueryImageData(s1Var.field_timestamp, s1Var.field_msg_id, s1Var.field_hd_image_path, s1Var.field_origin_image_path, s1Var.field_label_id, s1Var.field_crop_label_id, s1Var.field_ocr_result));
        }
        return arrayList;
    }

    /* renamed from: e */
    public final List<C57602s1> mo81940e(String str, String str2) {
        C39622i0 a;
        C87412m.m108594g(str, "labelId");
        C87412m.m108594g(str2, "chatRoomId");
        Class cls = C57604w3.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        String str3 = "'%#" + str + "#%'";
        C87412m.m108594g(str3, "labelId");
        List<C57602s1> multiQuery = C66267j1.f190595p.selectAll().log("MicroMsg.ClsLabelInfoStorage").where(new Sql.Equal("chat_room_id", str2).and(new Sql.Like("label_id", str3))).build().multiQuery(((C57603t1) ((C57604w3) a).mo85233d3(C57603t1.class)).getDbProvider().getDB(), C57602s1.class);
        Log.m105924i("MicroMsg.ClsLabelInfoStorage", "select result: " + multiQuery.size());
        Log.m105924i("MicroMsg.ImageQueryStorage", "result >> size: " + multiQuery.size());
        return multiQuery;
    }

    /* renamed from: f */
    public final ArrayList<QueryImageData> mo81941f(String str, int i, int i2) {
        C39622i0 a;
        C87412m.m108594g(str, "roomId");
        Class cls = C57604w3.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        List<C57602s1> d3 = ((C57603t1) ((C57604w3) a).mo85233d3(C57603t1.class)).mo81952d3(str, "1", i2, i);
        Log.m105924i("MicroMsg.ImageQueryStorage", "selectClsImageListIsRe >> " + str + ' ' + d3.size());
        ArrayList<QueryImageData> arrayList = new ArrayList<>();
        for (C57602s1 s1Var : d3) {
            arrayList.add(new QueryImageData(s1Var.field_timestamp, s1Var.field_msg_id, s1Var.field_hd_image_path, s1Var.field_origin_image_path, s1Var.field_label_id, s1Var.field_crop_label_id, s1Var.field_ocr_result));
        }
        return arrayList;
    }

    /* renamed from: g */
    public final ArrayList<C32466a> mo81942g(String str) {
        C39622i0 a;
        C87412m.m108594g(str, "roomId");
        Class cls = C57604w3.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        List<C30750j2> multiQuery = C38632p1.f103296h.selectAll().where(new Sql.Equal("chat_room_id", str)).build().multiQuery(((C57598k2) ((C57604w3) a).mo85233d3(C57598k2.class)).getDbProvider().getDB(), C30750j2.class);
        Log.m105924i("MicroMsg.CropCenterStorage", "getCropImagePathByRoomId >> " + str + " : " + multiQuery.size());
        Log.m105924i("MicroMsg.ImageQueryStorage", "selectCropCenterImage >> " + str + ' ' + multiQuery.size());
        ArrayList<C32466a> arrayList = new ArrayList<>();
        for (C30750j2 j2Var : multiQuery) {
            String str2 = j2Var.field_label_id;
            C87412m.m108593f(str2, "it.field_label_id");
            String str3 = j2Var.field_crop_image_path;
            C87412m.m108593f(str3, "it.field_crop_image_path");
            arrayList.add(new C32466a(str2, str3));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final C30744h4 mo81943h(String str) {
        C39622i0 a;
        C87412m.m108594g(str, "roomId");
        Class cls = C57604w3.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("chat_room_id", str);
        C30744h4 h4Var = (C30744h4) ((C57596i4) ((C57604w3) a).mo85233d3(C57596i4.class)).get(contentValues, C24560g0.m30725a(C30744h4.class));
        StringBuilder sb = new StringBuilder();
        sb.append("history result >> json: ");
        String str2 = null;
        sb.append(h4Var != null ? h4Var.field_cluster_history_data : null);
        sb.append(" , lastImage: ");
        if (h4Var != null) {
            str2 = h4Var.field_last_image_path;
        }
        sb.append(str2);
        Log.m105924i("MicroMsg.ImageQueryStorage", sb.toString());
        return h4Var;
    }

    /* renamed from: i */
    public final void mo81944i(String str, String str2, String str3, String str4) {
        C39622i0 a;
        C87412m.m108594g(str, "chatRoomId");
        C87412m.m108594g(str2, "labelId");
        C87412m.m108594g(str3, "cropImagePath");
        C87412m.m108594g(str4, "originPath");
        Log.m105924i("MicroMsg.ImageQueryStorage", "updateCropCenterImageInfo: " + str3 + " >> label id: " + str2);
        Class cls = C57604w3.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        C57598k2 k2Var = (C57598k2) ((C57604w3) a).mo85233d3(C57598k2.class);
        ContentValues contentValues = new ContentValues();
        contentValues.put("chat_room_id", str);
        contentValues.put("label_id", str2);
        C30750j2 j2Var = (C30750j2) k2Var.get(contentValues, C24560g0.m30725a(C30750j2.class));
        if (j2Var != null) {
            Log.m105924i("MicroMsg.CropCenterStorage", "update crop center label >>  room:" + str + ", label: " + str2);
            j2Var.field_crop_image_path = str3;
            j2Var.field_origin_image_path = str4;
            MvvmStorage.update$default(k2Var, j2Var, false, false, 6, (Object) null);
            return;
        }
        C30750j2 j2Var2 = new C30750j2();
        Log.m105924i("MicroMsg.CropCenterStorage", "add crop center label >>  room:" + str + ", label: " + str2);
        j2Var2.field_chat_room_id = str;
        j2Var2.field_crop_image_path = str3;
        j2Var2.field_label_id = str2;
        j2Var2.field_origin_image_path = str4;
        MvvmStorage.insert$default(k2Var, j2Var2, false, false, false, 14, (Object) null);
    }

    /* renamed from: j */
    public final void mo81945j(QueryImageData queryImageData, String str) {
        C39622i0 a;
        C87412m.m108594g(queryImageData, "imageData");
        C87412m.m108594g(str, "chatRoomId");
        Log.m105924i("MicroMsg.ImageQueryStorage", "updateImageClusterLabel: " + queryImageData.f154726g + " >> label id: " + queryImageData.f154728i);
        Class cls = C57604w3.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        C57603t1 t1Var = (C57603t1) ((C57604w3) a).mo85233d3(C57603t1.class);
        String str2 = queryImageData.f154726g;
        C87412m.m108593f(str2, "scanImagePath");
        String str3 = queryImageData.f154728i;
        C87412m.m108593f(str3, "cropLabelId");
        String str4 = queryImageData.f154727h;
        C87412m.m108593f(str4, "labelId");
        ContentValues contentValues = new ContentValues();
        contentValues.put("chat_room_id", str);
        contentValues.put("origin_image_path", str2);
        C57602s1 s1Var = (C57602s1) t1Var.get(contentValues, C24560g0.m30725a(C57602s1.class));
        if (s1Var != null) {
            s1Var.field_crop_label_id = str3;
            s1Var.field_is_recognize = "1";
            s1Var.field_label_id = str4;
            MvvmStorage.update$default(t1Var, s1Var, false, false, 6, (Object) null);
        }
    }

    /* renamed from: k */
    public final void mo81946k(QueryImageData queryImageData, String str) {
        C39622i0 a;
        C87412m.m108594g(queryImageData, "imageData");
        C87412m.m108594g(str, "chatRoomId");
        Log.m105918d("MicroMsg.ImageQueryStorage", "updateImageLabelAndOcr >> " + Thread.currentThread().getName() + "***" + queryImageData.f154727h + "***" + queryImageData.f154729j);
        Class cls = C57604w3.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        C57603t1 t1Var = (C57603t1) ((C57604w3) a).mo85233d3(C57603t1.class);
        String str2 = queryImageData.f154726g;
        C87412m.m108593f(str2, "scanImagePath");
        String str3 = queryImageData.f154727h;
        C87412m.m108593f(str3, "labelId");
        String str4 = queryImageData.f154729j;
        C87412m.m108593f(str4, "ocrResult");
        ContentValues contentValues = new ContentValues();
        contentValues.put("chat_room_id", str);
        contentValues.put("origin_image_path", str2);
        C57602s1 s1Var = (C57602s1) t1Var.get(contentValues, C24560g0.m30725a(C57602s1.class));
        if (s1Var != null) {
            s1Var.field_label_id = str3;
            s1Var.field_ocr_result = str4;
            s1Var.field_is_recognize = "1";
            MvvmStorage.update$default(t1Var, s1Var, false, false, 6, (Object) null);
        }
    }
}
