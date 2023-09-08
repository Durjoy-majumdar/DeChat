package oicq.wlogin_sdk.request;

import java.io.Serializable;
import oicq.wlogin_sdk.sharemem.WloginSigInfo;

public class WUserSigInfo implements Serializable {
    public static final long serialVersionUID = 0;
    public byte[] _A2;
    public byte[] _A2_Key;
    public byte[] _D2;
    public byte[] _D2_Key;
    public byte[] _access_token;
    public byte[] _in_ksid;
    public byte[] _lsKey;
    public byte[] _noPicSig;
    public byte[] _openid;
    public byte[] _openkey;
    public byte[] _reserveData;
    public byte[] _sKey;
    public byte[] _sid;
    public byte[] _userA5;
    public byte[] _userA8;
    public byte[] _userPasswdSig;
    public byte[] _userSig64;
    public byte[] _userStSig;
    public byte[] _userStWebSig;
    public byte[] _userSt_Key;
    public byte[] _vkey;

    public void get_clone(WloginSigInfo wloginSigInfo) {
        byte[] bArr = wloginSigInfo._userStSig;
        this._userStSig = bArr == null ? new byte[0] : (byte[]) bArr.clone();
        byte[] bArr2 = wloginSigInfo._userSt_Key;
        this._userSt_Key = bArr2 == null ? new byte[0] : (byte[]) bArr2.clone();
        byte[] bArr3 = wloginSigInfo._userStWebSig;
        this._userStWebSig = bArr3 == null ? new byte[0] : (byte[]) bArr3.clone();
        byte[] bArr4 = wloginSigInfo._en_A1;
        this._userPasswdSig = bArr4 == null ? new byte[0] : (byte[]) bArr4.clone();
        byte[] bArr5 = wloginSigInfo._userA5;
        this._userA5 = bArr5 == null ? new byte[0] : (byte[]) bArr5.clone();
        byte[] bArr6 = wloginSigInfo._userA8;
        this._userA8 = bArr6 == null ? new byte[0] : (byte[]) bArr6.clone();
        byte[] bArr7 = wloginSigInfo._lsKey;
        this._lsKey = bArr7 == null ? new byte[0] : (byte[]) bArr7.clone();
        byte[] bArr8 = wloginSigInfo._sKey;
        this._sKey = bArr8 == null ? new byte[0] : (byte[]) bArr8.clone();
        byte[] bArr9 = wloginSigInfo._userSig64;
        this._userSig64 = bArr9 == null ? new byte[0] : (byte[]) bArr9.clone();
        byte[] bArr10 = wloginSigInfo._openid;
        this._openid = bArr10 == null ? new byte[0] : (byte[]) bArr10.clone();
        byte[] bArr11 = wloginSigInfo._openkey;
        this._openkey = bArr11 == null ? new byte[0] : (byte[]) bArr11.clone();
        byte[] bArr12 = wloginSigInfo._vkey;
        this._vkey = bArr12 == null ? new byte[0] : (byte[]) bArr12.clone();
        byte[] bArr13 = wloginSigInfo._TGT;
        this._A2 = bArr13 == null ? new byte[0] : (byte[]) bArr13.clone();
        byte[] bArr14 = wloginSigInfo._TGTKey;
        this._A2_Key = bArr14 == null ? new byte[0] : (byte[]) bArr14.clone();
        byte[] bArr15 = wloginSigInfo._access_token;
        this._access_token = bArr15 == null ? new byte[0] : (byte[]) bArr15.clone();
        byte[] bArr16 = wloginSigInfo._D2;
        this._D2 = bArr16 == null ? new byte[0] : (byte[]) bArr16.clone();
        byte[] bArr17 = wloginSigInfo._D2Key;
        this._D2_Key = bArr17 == null ? new byte[0] : (byte[]) bArr17.clone();
        byte[] bArr18 = wloginSigInfo._sid;
        this._sid = bArr18 == null ? new byte[0] : (byte[]) bArr18.clone();
        byte[] bArr19 = wloginSigInfo._noPicSig;
        this._noPicSig = bArr19 == null ? new byte[0] : (byte[]) bArr19.clone();
    }
}
