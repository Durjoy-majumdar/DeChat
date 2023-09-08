package com.tencent.p014mm.storage;

import a14.C0000n0;
import android.content.ContentValues;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage;
import fy3.C32227p;
import gy3.C24560g0;
import gy3.C87412m;
import i40.C60247c;
import java.util.List;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.storage.ImageQueryStorage$deleteImage$1", mo125469f = "ImageQueryStorage.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.storage.x3 */
public final class C57605x3 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ long f164924d;

    /* renamed from: e */
    public final /* synthetic */ String f164925e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57605x3(long j, String str, C15601d<? super C57605x3> dVar) {
        super(2, dVar);
        this.f164924d = j;
        this.f164925e = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C57605x3(this.f164924d, this.f164925e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C57605x3) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Class<C30744h4> cls = C30744h4.class;
        Class cls2 = C57596i4.class;
        Class cls3 = C57603t1.class;
        Class cls4 = C57604w3.class;
        ResultKt.throwOnFailure(obj);
        C60247c.C60248a aVar = C60247c.f171775g;
        C57603t1 t1Var = (C57603t1) ((C57604w3) aVar.mo85234a(cls4)).mo85233d3(cls3);
        long j = this.f164924d;
        String str2 = this.f164925e;
        C87412m.m108594g(str2, "roomId");
        Log.m105924i("MicroMsg.ClsLabelInfoStorage", "deleteImageByMsgIdAndRoomId >> msgId: " + j + ", roomId: " + str2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("chat_room_id", str2);
        contentValues.put("msg_id", Long.valueOf(j));
        C57602s1 s1Var = (C57602s1) t1Var.get(contentValues, C24560g0.m30725a(C57602s1.class));
        if (s1Var != null) {
            Log.m105924i("MicroMsg.ClsLabelInfoStorage", "deleteImageByMsgIdAndRoomId, find to delete >> msgId: " + j + ", scanImage path: " + s1Var.field_origin_image_path);
            MvvmStorage.delete$default(t1Var, s1Var, false, false, 4, (Object) null);
            str = s1Var.field_origin_image_path;
        } else {
            str = null;
        }
        if (str != null) {
            long j2 = this.f164924d;
            String str3 = this.f164925e;
            Log.m105924i("MicroMsg.ImageQueryStorage", "deleteImage find it>> msgId: " + j2 + ", scanImagePath: " + str);
            C87412m.m108594g(str3, "roomId");
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("chat_room_id", str3);
            C30744h4 h4Var = (C30744h4) ((C57596i4) ((C57604w3) aVar.mo85234a(cls4)).mo85233d3(cls2)).get(contentValues2, C24560g0.m30725a(cls));
            if (h4Var != null && C87412m.m108589b(h4Var.field_last_image_path, str)) {
                Log.m105924i("MicroMsg.ImageQueryStorage", "delete image is the last image");
                List<C57602s1> d3 = ((C57603t1) ((C57604w3) aVar.mo85234a(cls4)).mo85233d3(cls3)).mo81952d3(str3, "1", 0, 1);
                if (true ^ d3.isEmpty()) {
                    C57596i4 i4Var = (C57596i4) ((C57604w3) aVar.mo85234a(cls4)).mo85233d3(cls2);
                    String str4 = d3.get(0).field_origin_image_path;
                    C87412m.m108593f(str4, "list[0].field_origin_image_path");
                    ContentValues contentValues3 = new ContentValues();
                    contentValues3.put("chat_room_id", str3);
                    C30744h4 h4Var2 = (C30744h4) i4Var.get(contentValues3, C24560g0.m30725a(cls));
                    if (h4Var2 != null) {
                        h4Var2.field_last_image_path = str4;
                        MvvmStorage.update$default(i4Var, h4Var2, false, false, 6, (Object) null);
                    }
                }
            }
        }
        return C13598b0.f38549a;
    }
}
