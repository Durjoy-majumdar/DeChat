package y72;

import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.protocal.MMProtocalJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C31461f3;
import eb0.C97625j3;
import f40.C86709a0;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;

/* renamed from: y72.g */
public class C102822g implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ C102819d f303543d;

    /* renamed from: e */
    public final /* synthetic */ C31461f3 f303544e;

    /* renamed from: f */
    public final /* synthetic */ C102823h f303545f;

    public C102822g(C102823h hVar, C102819d dVar, C31461f3 f3Var) {
        this.f303545f = hVar;
        this.f303543d = dVar;
        this.f303544e = f3Var;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        int i2 = i;
        C98121d dVar2 = dVar;
        Log.m105919d("MicroMsg.MsgSynchronizeServer", "msgSynchronize cdnCallback clientid:%s, startRet:%d proginfo:[%s], res:[%s]", str, Integer.valueOf(i), cVar, dVar2);
        if (i2 == -21005) {
            Log.m105919d("MicroMsg.MsgSynchronizeServer", "msgSynchronize  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", str);
            return 0;
        } else if (i2 != 0) {
            Log.m105921e("MicroMsg.MsgSynchronizeServer", "msgSynchronize cdn callback startRet failed. clientid:%s, startRet:%d", str, Integer.valueOf(i));
            this.f303545f.mo142551a();
            this.f303545f.mo142552b(this.f303543d.f303520a);
            C38972b.m41983b(0, 0, 0, 0, 1, this.f303545f.f303548b, this.f303543d.f303520a);
            return 0;
        } else {
            if (dVar2 != null) {
                int i3 = dVar2.field_retCode;
                if (i3 != 0) {
                    Log.m105921e("MicroMsg.MsgSynchronizeServer", "msgSynchronize cdn callback failed. sceneResult.retCode[%d], arg[%s], info[%s], clientid[%s], filemd5[%s]", Integer.valueOf(i3), dVar2.field_arg, dVar2.field_transInfo, str, dVar2.field_filemd5);
                    this.f303545f.mo142552b(this.f303543d.f303520a);
                    this.f303545f.mo142551a();
                    C38972b.m41983b(0, 0, 0, 0, 1, this.f303545f.f303548b, this.f303543d.f303520a);
                } else {
                    Log.m105925i("MicroMsg.MsgSynchronizeServer", "msgSynchronize cdn callback success. clientid[%s], filemd5[%s], isHitCacheUpload[%d]", str, dVar2.field_filemd5, Integer.valueOf(dVar2.field_UploadHitCacheType));
                    PByteArray pByteArray = new PByteArray();
                    if (!MMProtocalJni.rsaPublicEncryptPemkey(dVar2.field_aesKey.getBytes(), pByteArray, this.f303543d.f303521b)) {
                        Log.m105920e("MicroMsg.MsgSynchronizeServer", "msgSynchronize MMProtocalJni rsaPublicEncryptPemkey failed!");
                        return -1;
                    }
                    String encodeHexString = Util.encodeHexString(pByteArray.value);
                    C102819d dVar3 = this.f303543d;
                    String str2 = dVar2.field_fileId;
                    dVar3.getClass();
                    dVar3.f303527h = new String(str2);
                    dVar3.f303528i = new String(encodeHexString);
                    dVar3.f303529j = (int) dVar2.field_fileLength;
                    if (C86709a0.m107523b().mo121120t()) {
                        Log.m105924i("MicroMsg.MsgSynchronizeServer", "sendAppMsg immediately.");
                        this.f303545f.mo142553c(this.f303543d, false);
                    } else {
                        Log.m105924i("MicroMsg.MsgSynchronizeServer", "wait getOnlineInfoExtDeviceOnlineListener to sendAppMsg.");
                        C97625j3.m125812b().mo105886a(this.f303544e);
                        this.f303545f.f303550d = true;
                    }
                }
            }
            return 0;
        }
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        return new byte[0];
    }
}
