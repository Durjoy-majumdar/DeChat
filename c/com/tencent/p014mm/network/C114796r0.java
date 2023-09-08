package com.tencent.p014mm.network;

import com.tencent.mars.comm.WakerLock;
import com.tencent.mars.p468mm.MMLogic;
import com.tencent.mars.stn.StnLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import qe3.C89638z0;
import yb0.C118950a;

/* renamed from: com.tencent.mm.network.r0 */
public class C114796r0 implements StnLogic.ICallBack {

    /* renamed from: b */
    public static WakerLock f344185b;

    /* renamed from: c */
    public static byte[] f344186c;

    /* renamed from: d */
    public static byte[] f344187d;

    /* renamed from: a */
    public final long f344188a = C114803y.m161594k();

    /* renamed from: a */
    public static String m161575a(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public int buf2Resp(int i, Object obj, byte[] bArr, int[] iArr, int[] iArr2, int i2) {
        if (C114781l0.m161559f() == null) {
            return -1;
        }
        try {
            return C114781l0.m161559f().mo174425a(i, obj, bArr, iArr, iArr2, i2);
        } catch (Exception e) {
            Log.m105920e("StnCallBack", m161575a(e));
            Objects.toString(e.getStackTrace()[0]);
            Objects.toString(e.getStackTrace()[1]);
            return -1;
        }
    }

    public int getLongLinkIdentifyCheckBuffer(String str, ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2, int[] iArr) {
        int i = 0;
        iArr[0] = 205;
        iArr[1] = 1000000205;
        if (C114781l0.m161554a() != null) {
            try {
                byte[] l = C114781l0.m161554a().mo174494l();
                if (l != null) {
                    byteArrayOutputStream.write(l);
                    f344186c = l;
                }
                byte[] bArr = C114781l0.m161554a().f344218x;
                if (bArr != null) {
                    byteArrayOutputStream2.write(bArr);
                    f344187d = bArr;
                }
                i = C114781l0.m161554a().f344208n.f344122j;
            } catch (Exception e) {
                Log.m105920e("StnCallBack", m161575a(e));
                byte[] bArr2 = f344186c;
                if (!(bArr2 == null || f344187d == null)) {
                    try {
                        byteArrayOutputStream.write(bArr2);
                        byteArrayOutputStream2.write(f344187d);
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return (i == 0 || byteArrayOutputStream.size() == 0 || byteArrayOutputStream2.size() == 0) ? StnLogic.ECHECK_NEXT : StnLogic.ECHECK_NOW;
    }

    public boolean isLogoned() {
        if (C114781l0.m161554a() == null) {
            return false;
        }
        try {
            return C114781l0.m161554a().f344208n.mo54108G3();
        } catch (Exception e) {
            Log.m105920e("StnCallBack", m161575a(e));
            Objects.toString(e.getStackTrace()[0]);
            Objects.toString(e.getStackTrace()[1]);
            return false;
        }
    }

    public boolean makesureAuthed(String str) {
        if (C114781l0.m161554a() == null) {
            return false;
        }
        try {
            return C114781l0.m161554a().mo174496n(str);
        } catch (Exception e) {
            Log.m105920e("StnCallBack", m161575a(e));
            Objects.toString(e.getStackTrace()[0]);
            Objects.toString(e.getStackTrace()[1]);
            return false;
        }
    }

    public void networkAnalysisCallBack(int i, int i2, boolean z, String str) {
        Log.m105925i("StnCallBack", "networkAnalysisCallBack: status:%d, stage:%d, isDetectEnd:%b, kvInfo:%s", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), str);
        try {
            C114781l0.m161554a().f344219y.networkAnalysisCallBack(i, i2, z, str);
        } catch (Exception e) {
            Log.printErrStackTrace("StnCallBack", e, "", new Object[0]);
            Objects.toString(e.getStackTrace()[0]);
            Objects.toString(e.getStackTrace()[1]);
        }
    }

    public boolean onLongLinkIdentifyResp(String str, byte[] bArr, byte[] bArr2) {
        if (!(bArr == null || bArr2 == null)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(bArr);
                byteArrayOutputStream.write(bArr2);
            } catch (IOException unused) {
            }
            boolean z = false;
            onPush(str, 1000000205, 0, byteArrayOutputStream.toByteArray());
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C114781l0.m161554a().getClass();
            if (byteArray == null || byteArray.length == 0) {
                Log.m105928w("MicroMsg.MMAutoAuth", "synccheck response is empty");
            } else {
                C89638z0 z0Var = new C89638z0();
                try {
                    z0Var.fromProtoBuf(byteArray);
                    byte[] bArr3 = z0Var.f257871f;
                    if (bArr3 != null) {
                        byte[] bArr4 = z0Var.f257872g;
                        if (bArr3[0] == 0 && bArr3[10] == 0 && bArr3[20] == 0 && bArr3[30] == 0) {
                            z = true;
                        }
                        Log.m105924i("MicroMsg.MMAutoAuth", "networkid " + bArr3.length);
                        if (bArr4 != null) {
                            Log.m105924i("MicroMsg.MMAutoAuth", "ctx " + bArr4.length);
                        } else {
                            Log.m105924i("MicroMsg.MMAutoAuth", "ctx is null");
                        }
                        MMLogic.setNetworkId("synccheck", z ? "empty" : new String(bArr3), new String(bArr4), z0Var.f257870e);
                    }
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.MMAutoAuth", "newsync parse failed " + e.getLocalizedMessage());
                }
            }
        }
        return true;
    }

    public String[] onNewDns(String str) {
        return new String[0];
    }

    public void onPush(String str, int i, int i2, byte[] bArr) {
        if (C114781l0.m161557d() != null) {
            try {
                if (f344185b == null) {
                    f344185b = new WakerLock(C114781l0.m161555b(), "StnCallBack");
                }
                Log.m105924i("StnCallBack", "onPush lock");
                f344185b.lock(this.f344188a, "StnLogic.onNotify");
                C114781l0.m161556c().post(new r0$$a(i, bArr));
            } catch (Exception e) {
                Log.m105920e("StnCallBack", m161575a(e));
                Objects.toString(e.getStackTrace()[0]);
                Objects.toString(e.getStackTrace()[1]);
            }
        }
    }

    public int onTaskEnd(int i, Object obj, int i2, int i3, StnLogic.CgiProfile cgiProfile) {
        int i4;
        StnLogic.CgiProfile cgiProfile2 = cgiProfile;
        if (C114781l0.m161559f() == null) {
            return 0;
        }
        Log.m105918d("StnCallBack", "onTaskEnd " + cgiProfile2.startConnectTime + " " + cgiProfile2.readPacketFinishedTime + " " + cgiProfile2.rtt + " " + cgiProfile2.channelType + " " + cgiProfile2.taskStartTime);
        try {
            int i5 = i;
            i4 = C114781l0.m161559f().mo174427c(i);
            try {
                C114781l0.m161556c().post(new r0$$b(this, i, obj, i2, i3, cgiProfile));
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            i4 = 0;
            Log.m105920e("StnCallBack", m161575a(e));
            Objects.toString(e.getStackTrace()[0]);
            Objects.toString(e.getStackTrace()[1]);
            return i4;
        }
        return i4;
    }

    public void reportConnectInfo(int i, int i2) {
        try {
            C114781l0.m161560g().mo174443c(i);
            C118950a.f356273b.f356286d = i;
            if (i2 == 2) {
                AtomicInteger atomicInteger = C40380j0.f108507a;
                C40380j0.f108508b.getValue().mo63091a("longlink connect fail");
            }
        } catch (Exception e) {
            Log.m105921e("StnCallBack", "reportConnectInfo :%s", Util.stackTraceToString(e));
        }
    }

    public boolean req2Buf(int i, Object obj, ByteArrayOutputStream byteArrayOutputStream, int[] iArr, int i2, String str) {
        if (C114781l0.m161559f() == null) {
            return false;
        }
        try {
            return C114781l0.m161559f().mo174433h(i, obj, byteArrayOutputStream, iArr, i2, str);
        } catch (Exception e) {
            Log.m105920e("StnCallBack", m161575a(e));
            Objects.toString(e.getStackTrace()[0]);
            Objects.toString(e.getStackTrace()[1]);
            return false;
        }
    }

    public void requestDoSync() {
        if (C114781l0.m161557d() != null) {
            try {
                C114781l0.m161556c().post(new r0$$c(this));
            } catch (Exception e) {
                Log.m105920e("StnCallBack", m161575a(e));
                Objects.toString(e.getStackTrace()[0]);
                Objects.toString(e.getStackTrace()[1]);
            }
        }
    }

    public String[] requestNetCheckShortLinkHosts() {
        return new String[0];
    }
}
