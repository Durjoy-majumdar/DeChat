package oicq.wlogin_sdk.request;

import java.io.Serializable;
import java.util.TreeMap;
import oicq.wlogin_sdk.sharemem.WloginSigInfo;
import oicq.wlogin_sdk.sharemem.WloginSimpleInfo;
import oicq.wlogin_sdk.tools.C117790util;

public class WloginAllSigInfo implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    public TreeMap<Long, WloginSigInfo> _tk_map = new TreeMap<>();
    public long _uin = 0;
    public WloginSimpleInfo _useInfo = new WloginSimpleInfo();

    public WloginAllSigInfo get_clone() {
        try {
            return (WloginAllSigInfo) clone();
        } catch (Exception e) {
            C117790util.m166179a(e.toString());
            return null;
        }
    }

    public int put_siginfo(long j, long j2, long j3, long j4, long j5, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9, byte[] bArr10, byte[] bArr11, byte[] bArr12, byte[][] bArr13) {
        long j6 = j;
        WloginSigInfo wloginSigInfo = this._tk_map.get(new Long(j6));
        if (wloginSigInfo != null) {
            this._tk_map.put(new Long(j6), wloginSigInfo.Set(j2, j3, j4, j5, bArr, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, bArr8, bArr9, bArr10, bArr11, bArr12, bArr13));
            return 0;
        }
        this._tk_map.put(new Long(j6), new WloginSigInfo(j2, j3, j4, j5, bArr, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, bArr8, bArr9, bArr10, bArr11, bArr12, bArr13));
        return 0;
    }
}
