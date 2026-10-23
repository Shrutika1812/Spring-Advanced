# JWT Authentication Flow

1. Verify credentials.
2. Issue a short-lived access token.
3. Send it with protected requests.
4. Security filters validate the token.
5. Use refresh tokens for controlled token renewal.

Never put passwords or sensitive secrets inside JWT claims.
