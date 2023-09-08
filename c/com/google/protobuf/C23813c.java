package com.google.protobuf;

import com.google.protobuf.C23810b;
import com.google.protobuf.C23845j1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.c */
public abstract class C23813c<MessageType extends C23845j1> implements C24062w1<MessageType> {
    private static final C23806a0 EMPTY_REGISTRY = C23806a0.m28602a();

    private MessageType checkMessageInitialized(MessageType messagetype) {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        C104490q2 newUninitializedMessageException = newUninitializedMessageException(messagetype);
        newUninitializedMessageException.getClass();
        C23922p0 p0Var = new C23922p0(newUninitializedMessageException.getMessage());
        p0Var.f68530d = messagetype;
        throw p0Var;
    }

    private C104490q2 newUninitializedMessageException(MessageType messagetype) {
        return messagetype instanceof C23810b ? ((C23810b) messagetype).newUninitializedMessageException() : new C104490q2((C23845j1) messagetype);
    }

    public MessageType parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
        return checkMessageInitialized(parsePartialDelimitedFrom(inputStream, a0Var));
    }

    public MessageType parsePartialDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return parsePartialFrom((InputStream) new C23810b.C23811a.C16984a(inputStream, C23856l.m28960y(read, inputStream)), a0Var);
        } catch (IOException e) {
            throw new C23922p0(e);
        }
    }

    public MessageType parseDelimitedFrom(InputStream inputStream) {
        return parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    public MessageType parsePartialDelimitedFrom(InputStream inputStream) {
        return parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    public MessageType parsePartialFrom(C23856l lVar) {
        return (C23845j1) parsePartialFrom(lVar, EMPTY_REGISTRY);
    }

    public MessageType parsePartialFrom(C16994k kVar, C23806a0 a0Var) {
        MessageType messagetype;
        try {
            C23856l o = kVar.mo18745o();
            messagetype = (C23845j1) parsePartialFrom(o, a0Var);
            o.mo37761a(0);
            return messagetype;
        } catch (C23922p0 e) {
            e.f68530d = messagetype;
            throw e;
        } catch (C23922p0 e2) {
            throw e2;
        }
    }

    public MessageType parseFrom(C23856l lVar, C23806a0 a0Var) {
        return checkMessageInitialized((C23845j1) parsePartialFrom(lVar, a0Var));
    }

    public MessageType parseFrom(C23856l lVar) {
        return parseFrom(lVar, EMPTY_REGISTRY);
    }

    public MessageType parseFrom(C16994k kVar, C23806a0 a0Var) {
        return checkMessageInitialized(parsePartialFrom(kVar, a0Var));
    }

    public MessageType parseFrom(C16994k kVar) {
        return parseFrom(kVar, EMPTY_REGISTRY);
    }

    public MessageType parseFrom(ByteBuffer byteBuffer) {
        return parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    public MessageType parsePartialFrom(C16994k kVar) {
        return parsePartialFrom(kVar, EMPTY_REGISTRY);
    }

    public MessageType parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
        C23845j1 j1Var;
        try {
            C23856l h = C23856l.m28958h(byteBuffer, false);
            j1Var = (C23845j1) parsePartialFrom(h, a0Var);
            h.mo37761a(0);
            return checkMessageInitialized(j1Var);
        } catch (C23922p0 e) {
            e.f68530d = j1Var;
            throw e;
        } catch (C23922p0 e2) {
            throw e2;
        }
    }

    public MessageType parsePartialFrom(byte[] bArr, int i, int i2, C23806a0 a0Var) {
        MessageType messagetype;
        try {
            C23856l i3 = C23856l.m28959i(bArr, i, i2, false);
            messagetype = (C23845j1) parsePartialFrom(i3, a0Var);
            i3.mo37761a(0);
            return messagetype;
        } catch (C23922p0 e) {
            e.f68530d = messagetype;
            throw e;
        } catch (C23922p0 e2) {
            throw e2;
        }
    }

    public MessageType parsePartialFrom(byte[] bArr, int i, int i2) {
        return parsePartialFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    public MessageType parseFrom(byte[] bArr, int i, int i2, C23806a0 a0Var) {
        return checkMessageInitialized(parsePartialFrom(bArr, i, i2, a0Var));
    }

    public MessageType parsePartialFrom(byte[] bArr, C23806a0 a0Var) {
        return parsePartialFrom(bArr, 0, bArr.length, a0Var);
    }

    public MessageType parseFrom(byte[] bArr, int i, int i2) {
        return parseFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    public MessageType parsePartialFrom(byte[] bArr) {
        return parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    public MessageType parseFrom(byte[] bArr, C23806a0 a0Var) {
        return parseFrom(bArr, 0, bArr.length, a0Var);
    }

    public MessageType parsePartialFrom(InputStream inputStream, C23806a0 a0Var) {
        C23856l g = C23856l.m28957g(inputStream);
        MessageType messagetype = (C23845j1) parsePartialFrom(g, a0Var);
        try {
            g.mo37761a(0);
            return messagetype;
        } catch (C23922p0 e) {
            e.f68530d = messagetype;
            throw e;
        }
    }

    public MessageType parseFrom(byte[] bArr) {
        return parseFrom(bArr, EMPTY_REGISTRY);
    }

    public MessageType parseFrom(InputStream inputStream, C23806a0 a0Var) {
        return checkMessageInitialized(parsePartialFrom(inputStream, a0Var));
    }

    public MessageType parseFrom(InputStream inputStream) {
        return parseFrom(inputStream, EMPTY_REGISTRY);
    }

    public MessageType parsePartialFrom(InputStream inputStream) {
        return parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }
}
