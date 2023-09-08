package vs0;

import com.google.android.gms.common.util.AndroidUtilsLight;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import ts0.C90577a;
import vs0.C90866a;
import ws0.C91102b;
import ws0.C91103c;
import xs0.C91338b;
import xs0.C91340d;
import xs0.C91342e;
import ys0.C91578a;
import ys0.C91579b;
import ys0.C91583f;
import ys0.C91584g;
import zs0.C91932a;
import zs0.C91934b;

/* renamed from: vs0.b */
public class C90869b extends C90866a {

    /* renamed from: b */
    public ByteBuffer f260852b;

    /* renamed from: c */
    public final Random f260853c = new Random();

    /* renamed from: vs0.b$a */
    public class C90870a extends Throwable {

        /* renamed from: d */
        public int f260854d;

        public C90870a(C90869b bVar, int i) {
            this.f260854d = i;
        }
    }

    /* renamed from: a */
    public C90866a.C90868b mo124964a(C91578a aVar, C91584g gVar) {
        C90866a.C90868b bVar = C90866a.C90868b.NOT_MATCHED;
        String c = aVar.mo125461c("Sec-WebSocket-Protocol");
        String c2 = gVar.mo125461c("Sec-WebSocket-Protocol");
        if (!Util.isNullOrNil(c) && !Util.isNullOrNil(c2)) {
            boolean z = true;
            Log.m105919d("MicroMsg.AppBrandNetWork.Draft_10", "respProtocol is %s", c2);
            String[] split = c.split(", ");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if (c2.equals(split[i])) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                return bVar;
            }
        }
        if (aVar.mo125462e("Sec-WebSocket-Key") && gVar.mo125462e("Sec-WebSocket-Accept")) {
            if (mo124975m(aVar.mo125461c("Sec-WebSocket-Key")).equals(gVar.mo125461c("Sec-WebSocket-Accept"))) {
                return C90866a.C90868b.MATCHED;
            }
        }
        return bVar;
    }

    /* renamed from: b */
    public C90866a.C90868b mo124965b(C91578a aVar) {
        C90866a.C90868b bVar = C90866a.C90868b.NOT_MATCHED;
        String c = aVar.mo125461c("Sec-WebSocket-Version");
        int i = -1;
        if (c.length() > 0) {
            try {
                i = new Integer(c.trim()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        if (i != 7 && i != 8) {
            return bVar;
        }
        return aVar.mo125461c("Upgrade").equalsIgnoreCase("websocket") && aVar.mo125461c("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade") ? C90866a.C90868b.MATCHED : bVar;
    }

    /* renamed from: c */
    public C90866a mo124966c() {
        return new C90869b();
    }

    /* renamed from: d */
    public ByteBuffer mo124967d(C91340d dVar) {
        byte b;
        ByteBuffer f = dVar.mo125322f();
        int i = 0;
        boolean z = this.f260844a == C90577a.C90579b.CLIENT;
        int i2 = f.remaining() <= 125 ? 1 : f.remaining() <= 65535 ? 2 : 8;
        ByteBuffer allocate = ByteBuffer.allocate((i2 > 1 ? i2 + 1 : i2) + 1 + (z ? 4 : 0) + f.remaining());
        C91340d.C91341a d = dVar.mo125327d();
        if (d == C91340d.C91341a.CONTINUOUS) {
            b = 0;
        } else if (d == C91340d.C91341a.TEXT) {
            b = 1;
        } else if (d == C91340d.C91341a.BINARY) {
            b = 2;
        } else {
            if (d != C91340d.C91341a.CLOSING) {
                if (d == C91340d.C91341a.PING) {
                    b = 9;
                } else if (d == C91340d.C91341a.PONG) {
                    b = 10;
                } else {
                    Log.m105920e("MicroMsg.AppBrandNetWork.Draft_10", "Don't know how to handle force close" + d.toString());
                }
            }
            b = 8;
        }
        allocate.put((byte) (b | ((byte) (dVar.mo125328e() ? -128 : 0))));
        long remaining = (long) f.remaining();
        byte[] bArr = new byte[i2];
        int i3 = (i2 * 8) - 8;
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) ((int) (remaining >>> (i3 - (i4 * 8))));
        }
        if (i2 == 1) {
            allocate.put((byte) (bArr[0] | (z ? Byte.MIN_VALUE : 0)));
        } else if (i2 == 2) {
            allocate.put((byte) ((z ? -128 : 0) | 126));
            allocate.put(bArr);
        } else if (i2 == 8) {
            allocate.put((byte) ((z ? -128 : 0) | 127));
            allocate.put(bArr);
        } else {
            Log.m105920e("MicroMsg.AppBrandNetWork.Draft_10", "Size representation not supported/specified");
        }
        if (z) {
            ByteBuffer allocate2 = ByteBuffer.allocate(4);
            allocate2.putInt(this.f260853c.nextInt());
            allocate.put(allocate2.array());
            while (f.hasRemaining()) {
                allocate.put((byte) (f.get() ^ allocate2.get(i % 4)));
                i++;
            }
        } else {
            allocate.put(f);
        }
        allocate.flip();
        return allocate;
    }

    /* renamed from: e */
    public List<C91340d> mo124968e(String str, boolean z) {
        C91342e eVar = new C91342e();
        try {
            eVar.f261983c = ByteBuffer.wrap(C91934b.m115450b(str));
        } catch (C91102b e) {
            Log.m105920e("MicroMsg.AppBrandNetWork.Draft_10", "createFrames setPayload exception" + e.toString());
        }
        eVar.f261981a = true;
        eVar.f261982b = C91340d.C91341a.TEXT;
        eVar.f261984d = z;
        return Collections.singletonList(eVar);
    }

    /* renamed from: f */
    public List<C91340d> mo124969f(ByteBuffer byteBuffer, boolean z) {
        C91342e eVar = new C91342e();
        try {
            eVar.f261983c = byteBuffer;
        } catch (C91102b e) {
            Log.m105920e("MicroMsg.AppBrandNetWork.Draft_10", "createFrames setPayload exception" + e.toString());
        }
        eVar.f261981a = true;
        eVar.f261982b = C91340d.C91341a.BINARY;
        eVar.f261984d = z;
        return Collections.singletonList(eVar);
    }

    /* renamed from: g */
    public C90866a.C90867a mo124970g() {
        return C90866a.C90867a.TWOWAY;
    }

    /* renamed from: h */
    public C91579b mo124971h(C91579b bVar) {
        String str;
        C91583f fVar = (C91583f) bVar;
        fVar.mo125463g("Upgrade", "websocket");
        fVar.mo125463g("Connection", "Upgrade");
        fVar.mo125463g("Sec-WebSocket-Version", "8");
        byte[] bArr = new byte[16];
        this.f260853c.nextBytes(bArr);
        try {
            str = C91932a.m115447d(bArr, 0, 16, 0);
        } catch (IOException unused) {
            str = null;
        }
        fVar.mo125463g("Sec-WebSocket-Key", str);
        return bVar;
    }

    /* renamed from: j */
    public void mo124972j() {
        this.f260852b = null;
    }

    /* renamed from: k */
    public List<C91340d> mo124973k(ByteBuffer byteBuffer) {
        LinkedList linkedList = new LinkedList();
        if (this.f260852b != null) {
            try {
                byteBuffer.mark();
                int remaining = byteBuffer.remaining();
                int remaining2 = this.f260852b.remaining();
                if (remaining2 > remaining) {
                    this.f260852b.put(byteBuffer.array(), byteBuffer.position(), remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    return Collections.emptyList();
                }
                this.f260852b.put(byteBuffer.array(), byteBuffer.position(), remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
                linkedList.add(mo124976n((ByteBuffer) this.f260852b.duplicate().position(0)));
                this.f260852b = null;
            } catch (C90870a e) {
                this.f260852b.limit();
                int i = e.f260854d;
                if (i >= 0) {
                    ByteBuffer allocate = ByteBuffer.allocate(i);
                    this.f260852b.rewind();
                    allocate.put(this.f260852b);
                    this.f260852b = allocate;
                    return mo124973k(byteBuffer);
                }
                throw new C91102b(1002, "Negative count");
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(mo124976n(byteBuffer));
            } catch (C90870a e2) {
                byteBuffer.reset();
                int i2 = e2.f260854d;
                if (i2 >= 0) {
                    ByteBuffer allocate2 = ByteBuffer.allocate(i2);
                    this.f260852b = allocate2;
                    allocate2.put(byteBuffer);
                } else {
                    throw new C91102b(1002, "Negative count");
                }
            }
        }
        return linkedList;
    }

    /* renamed from: m */
    public final String mo124975m(String str) {
        try {
            byte[] digest = MessageDigest.getInstance(AndroidUtilsLight.DIGEST_ALGORITHM_SHA1).digest((str.trim() + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes());
            try {
                return C91932a.m115447d(digest, 0, digest.length, 0);
            } catch (IOException unused) {
                return null;
            }
        } catch (NoSuchAlgorithmException e) {
            Log.m105920e("MicroMsg.AppBrandNetWork.Draft_10", "not such algorithm " + e.toString());
            return "";
        }
    }

    /* renamed from: n */
    public C91340d mo124976n(ByteBuffer byteBuffer) {
        C91340d.C91341a aVar;
        C91342e eVar;
        C91340d.C91341a aVar2 = C91340d.C91341a.PONG;
        C91340d.C91341a aVar3 = C91340d.C91341a.PING;
        C91340d.C91341a aVar4 = C91340d.C91341a.CLOSING;
        int remaining = byteBuffer.remaining();
        int i = 2;
        if (remaining >= 2) {
            byte b = byteBuffer.get();
            boolean z = (b >> 8) != 0;
            byte b2 = (byte) ((b & Byte.MAX_VALUE) >> 4);
            if (b2 == 0) {
                byte b3 = byteBuffer.get();
                boolean z2 = (b3 & Byte.MIN_VALUE) != 0;
                int i2 = (byte) (b3 & Byte.MAX_VALUE);
                byte b4 = (byte) (b & 15);
                if (b4 == 0) {
                    aVar = C91340d.C91341a.CONTINUOUS;
                } else if (b4 == 1) {
                    aVar = C91340d.C91341a.TEXT;
                } else if (b4 != 2) {
                    switch (b4) {
                        case 8:
                            aVar = aVar4;
                            break;
                        case 9:
                            aVar = aVar3;
                            break;
                        case 10:
                            aVar = aVar2;
                            break;
                        default:
                            throw new C91103c("unknow optcode " + ((short) b4));
                    }
                } else {
                    aVar = C91340d.C91341a.BINARY;
                }
                if (z || !(aVar == aVar3 || aVar == aVar2 || aVar == aVar4)) {
                    if (i2 < 0 || i2 > 125) {
                        if (aVar == aVar3 || aVar == aVar2 || aVar == aVar4) {
                            throw new C91103c("more than 125 octets");
                        } else if (i2 != 126) {
                            i = 10;
                            if (remaining >= 10) {
                                byte[] bArr = new byte[8];
                                for (int i3 = 0; i3 < 8; i3++) {
                                    bArr[i3] = byteBuffer.get();
                                }
                                long longValue = new BigInteger(bArr).longValue();
                                if (longValue > 2147483647L) {
                                    Log.m105920e("MicroMsg.AppBrandNetWork.Draft_10", "Payloadsize is to big...");
                                } else {
                                    i2 = (int) longValue;
                                }
                            } else {
                                throw new C90870a(this, 10);
                            }
                        } else if (remaining >= 4) {
                            byte[] bArr2 = new byte[3];
                            bArr2[1] = byteBuffer.get();
                            bArr2[2] = byteBuffer.get();
                            i2 = new BigInteger(bArr2).intValue();
                            i = 4;
                        } else {
                            throw new C90870a(this, 4);
                        }
                    }
                    int i4 = i + (z2 ? 4 : 0) + i2;
                    if (remaining < i4) {
                        throw new C90870a(this, i4);
                    } else if (i2 >= 0) {
                        ByteBuffer allocate = ByteBuffer.allocate(i2);
                        if (z2) {
                            byte[] bArr3 = new byte[4];
                            byteBuffer.get(bArr3);
                            for (int i5 = 0; i5 < i2; i5++) {
                                allocate.put((byte) (byteBuffer.get() ^ bArr3[i5 % 4]));
                            }
                        } else {
                            allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
                            byteBuffer.position(byteBuffer.position() + allocate.limit());
                        }
                        if (aVar == aVar4) {
                            eVar = new C91338b();
                        } else {
                            eVar = new C91342e();
                            eVar.f261981a = z;
                            eVar.f261982b = aVar;
                        }
                        allocate.flip();
                        eVar.mo125323g(allocate);
                        return eVar;
                    } else {
                        throw new C91102b(1002, "Negative count");
                    }
                } else {
                    throw new C91103c("control frames may no be fragmented");
                }
            } else {
                throw new C91103c("bad rsv " + b2);
            }
        } else {
            throw new C90870a(this, 2);
        }
    }
}
