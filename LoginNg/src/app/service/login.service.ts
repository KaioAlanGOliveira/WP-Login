import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  private apiUrl = 'api/login';

  constructor(private http: HttpClient) { }

  logar(filtro: any): Observable<any> {
    alert('Login realizado com sucesso!');
    return this.http.post(this.apiUrl, filtro);
  }
}