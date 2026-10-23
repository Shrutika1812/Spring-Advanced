# N+1 Problem

If parent rows are loaded and each child collection triggers another query, database calls can explode.

Common fixes:
- JOIN FETCH
- EntityGraph
- batch fetching

Always inspect SQL before and after the optimization.
