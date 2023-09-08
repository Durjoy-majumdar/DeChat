package com.tencent.wxmm;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class v2stqos {
    private static final String TAG = "WXMM.Voip[stqos]";
    public byte cFps;
    public byte cHPPMaxLyr;
    public byte cIPeriod;
    public byte cIReqFlag;
    public byte cQPmax;
    public byte cQPmin;
    public byte cRSLevel;
    public byte cResolution;
    public byte cRsvd1;
    public byte cRsvd2;
    public byte cSkipFlag;
    public byte cSwitch;
    public short iKbps;
    public byte[] s2p = new byte[14];

    public void parseS2PData() {
        ByteBuffer wrap = ByteBuffer.wrap(this.s2p);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        this.iKbps = wrap.getShort();
        this.cFps = wrap.get();
        this.cIPeriod = wrap.get();
        this.cRSLevel = wrap.get();
        this.cQPmin = wrap.get();
        this.cQPmax = wrap.get();
        this.cHPPMaxLyr = wrap.get();
        this.cSwitch = wrap.get();
        this.cResolution = wrap.get();
        this.cRsvd1 = wrap.get();
        this.cRsvd2 = wrap.get();
        this.cSkipFlag = wrap.get();
        this.cIReqFlag = wrap.get();
    }

    public void printS2P() {
    }
}
