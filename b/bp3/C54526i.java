package bp3;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import q00.C12025f;
import q00.C62571i;

/* renamed from: bp3.i */
public final class C54526i {

    /* renamed from: a */
    public static final C54526i f152882a = new C54526i();

    /* renamed from: a */
    public final boolean mo75389a() {
        boolean z = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Global_ShowImageQuery_Int, 0) == 1;
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_image_query_entrance, false);
        Log.m105924i("MicroMsg.ImageQueryEntranceConfig", "getImageQueryEntranceConfig >> result: " + wf + ", repairConfig: " + z);
        return wf || z;
    }

    /* renamed from: b */
    public final boolean mo75390b() {
        C12025f IR = ((C62571i) C86312j.m106911c(C62571i.class)).mo87567IR();
        String a = IR.mo11889a("MODEL_CHAT_CLS_MODEL");
        boolean z = !(a == null || a.length() == 0);
        String a2 = IR.mo11889a("MODEL_CHAT_CLS_MAP");
        boolean z2 = !(a2 == null || a2.length() == 0);
        String a3 = IR.mo11889a("MODEL_FACE_FEATURE");
        boolean z3 = !(a3 == null || a3.length() == 0);
        String a4 = IR.mo11889a("MODEL_OCR_REC_MODEL");
        boolean z4 = !(a4 == null || a4.length() == 0);
        String a5 = IR.mo11889a("MODEL_OCR_DET");
        boolean z5 = !(a5 == null || a5.length() == 0);
        String a6 = IR.mo11889a("MODEL_OCR_REC_MAP");
        boolean z6 = !(a6 == null || a6.length() == 0);
        String a7 = IR.mo11889a("MODEL_MOBILE_POLICY_DB");
        boolean z7 = !(a7 == null || a7.length() == 0);
        String a8 = IR.mo11889a("MODEL_FACE_DETECT");
        boolean z8 = !(a8 == null || a8.length() == 0);
        String a9 = IR.mo11889a("MODEL_FACE_ALIGNMENT");
        boolean z9 = !(a9 == null || a9.length() == 0);
        String a15 = IR.mo11889a("MODEL_FACE3D_XBIN");
        boolean z15 = !(a15 == null || a15.length() == 0);
        Log.m105924i("MicroMsg.ImageQueryEntranceConfig", "checkModelFileExit >> clsExit: " + z + ", clsClazzNameExit: " + z + ", faceExit: " + z3 + ", ocrExit: " + z4 + ", facePoliticalDbExit: " + z7 + ", ocrDetExit: " + z5 + ", ocrRecExit: " + z6 + ", detectModelPathExit: " + z8 + ", alignModelPathExit: " + z9 + ", coreModelPathExit: " + z15);
        return z && z2 && z3 && z4 && z5 && z6 && z8 && z7 && z9 && z15;
    }
}
