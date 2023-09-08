package qe3;

import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import junit.framework.Assert;
import p823sg.C118283d;
import p823sg.C90193h;
import qe3.C89631w;

/* renamed from: qe3.c0 */
public final class C118177c0 {

    /* renamed from: qe3.c0$a */
    public static class C118178a extends C89631w.C89634d implements C89631w.C89633b {

        /* renamed from: a */
        public int f353292a = 0;

        /* renamed from: b */
        public int f353293b = 0;

        /* renamed from: c */
        public int f353294c = 0;

        /* renamed from: d */
        public String f353295d = "";

        /* renamed from: e */
        public byte[] f353296e = new byte[0];

        /* renamed from: a */
        public void mo182978a(byte[] bArr) {
            Assert.assertTrue(bArr != null);
            this.f353296e = bArr;
        }

        /* renamed from: b */
        public void mo182979b(int i) {
            this.f353293b = i;
        }

        /* renamed from: c */
        public void mo182980c(int i) {
            this.f353292a = i;
        }

        /* renamed from: d */
        public void mo182981d(String str) {
            Assert.assertTrue(str != null);
            this.f353295d = str;
        }

        /* renamed from: e */
        public void mo182982e(int i) {
            this.f353294c = i;
        }

        public int getCmdId() {
            return 8;
        }

        public int getFuncId() {
            return 10;
        }

        public boolean getShortSupport() {
            return false;
        }

        public boolean isRawData() {
            return true;
        }

        public byte[] toProtoBuf() {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeInt(this.f353294c);
                dataOutputStream.writeShort(this.f353295d.getBytes().length);
                dataOutputStream.write(this.f353295d.getBytes());
                dataOutputStream.writeShort(this.f353296e.length);
                dataOutputStream.write(this.f353296e);
                dataOutputStream.close();
            } catch (IOException e) {
                Log.m105920e("MicroMsg.MMDirectSend", "direct merge tail failed, err=" + e.getMessage());
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            PByteArray pByteArray = new PByteArray();
            C118283d.m166849b(pByteArray, byteArray, C118177c0.m166725a(super.getDeviceID()));
            byte[] bArr = pByteArray.value;
            if (bArr == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream2);
                dataOutputStream2.writeByte(this.f353292a);
                dataOutputStream2.writeByte(this.f353293b);
                dataOutputStream2.write(bArr);
                dataOutputStream2.close();
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.MMDirectSend", "direct merge all failed, err=" + e2.getMessage());
            }
            return byteArrayOutputStream2.toByteArray();
        }
    }

    /* renamed from: qe3.c0$b */
    public static class C118179b extends C89631w.C89636e implements C89631w.C89635c {

        /* renamed from: a */
        public int f353297a = 0;

        /* renamed from: b */
        public int f353298b = 0;

        /* renamed from: c */
        public int f353299c = 0;

        /* renamed from: d */
        public String f353300d = "";

        /* renamed from: e */
        public byte[] f353301e = new byte[0];

        /* renamed from: f */
        public String f353302f = "";

        /* renamed from: a */
        public final byte[] mo182983a(byte[] bArr) {
            if (bArr == null || bArr.length < 2) {
                Log.m105920e("MicroMsg.MMDirectSend", "parse all failed, empty buf");
                return null;
            }
            int length = bArr.length - 2;
            byte[] bArr2 = new byte[length];
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                this.f353297a = dataInputStream.readByte();
                this.f353298b = dataInputStream.readByte();
                dataInputStream.readFully(bArr2);
                Log.m105918d("MicroMsg.MMDirectSend", "cmdId:" + this.f353297a + ", flag=" + this.f353298b + ", tail len=" + length);
                byteArrayInputStream.close();
            } catch (IOException e) {
                Log.m105920e("MicroMsg.MMDirectSend", "direct parse all failed, err=" + e.getMessage());
            }
            return bArr2;
        }

        public int fromProtoBuf(byte[] bArr) {
            byte[] a = C118177c0.m166725a(this.f353302f);
            PByteArray pByteArray = new PByteArray();
            if (C118283d.m166848a(pByteArray, mo182983a(bArr), a) != 0) {
                byte[] bArr2 = new byte[16];
                for (int i = 0; i < 16; i++) {
                    bArr2[i] = 0;
                }
                if (C118283d.m166848a(pByteArray, mo182983a(bArr), bArr2) != 0) {
                    Log.m105921e("MicroMsg.MMDirectSend", "decrypting from buffer using key=%s error", Util.dumpHex(a));
                    return -1;
                }
            }
            byte[] bArr3 = pByteArray.value;
            if (bArr3 == null) {
                Log.m105920e("MicroMsg.MMDirectSend", "parse tail failed, empty buf");
            } else {
                try {
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr3));
                    this.f353299c = dataInputStream.readInt();
                    Log.m105918d("MicroMsg.MMDirectSend", "seq=" + this.f353299c);
                    int readShort = dataInputStream.readShort();
                    if (readShort >= 0) {
                        byte[] bArr4 = new byte[readShort];
                        dataInputStream.readFully(bArr4);
                        this.f353300d = new String(bArr4);
                        Log.m105918d("MicroMsg.MMDirectSend", "recievers len=" + readShort + ", sender=" + this.f353300d);
                        int readShort2 = dataInputStream.readShort();
                        if (readShort2 >= 0) {
                            byte[] bArr5 = new byte[readShort2];
                            this.f353301e = bArr5;
                            dataInputStream.readFully(bArr5);
                            Log.m105918d("MicroMsg.MMDirectSend", "content len=" + this.f353301e.length);
                        } else {
                            throw new IOException("content empty");
                        }
                    } else {
                        throw new IOException("sender empty");
                    }
                } catch (IOException e) {
                    Log.m105920e("MicroMsg.MMDirectSend", "direct parse all failed, err=" + e.getMessage());
                }
            }
            return 0;
        }

        public int getCmdId() {
            return 8;
        }

        public boolean isRawData() {
            return true;
        }
    }

    /* renamed from: a */
    public static byte[] m166725a(String str) {
        byte[] bArr = new byte[16];
        System.arraycopy(str.getBytes(), 0, bArr, 0, 15);
        bArr[15] = 0;
        byte[] g = C90193h.m112879g(bArr);
        Log.m105919d("MicroMsg.MMDirectSend", "new direct send: key=%s", Util.dumpHex(g));
        return g;
    }
}
