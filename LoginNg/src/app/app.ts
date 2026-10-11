import { Component, inject } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { InputTextModule } from 'primeng/inputtext';
import { PasswordModule } from 'primeng/password';
import { ButtonModule } from 'primeng/button';
import { CardModule } from 'primeng/card';
import { LoginService } from './service/login.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.html',
  styleUrl: './app.css',
  imports: [ReactiveFormsModule, InputTextModule, PasswordModule, ButtonModule, CardModule],
})

export class App {
  
  loginService = inject(LoginService);
  
  protected readonly form = new FormGroup({
    nome: new FormControl(''),
    senha: new FormControl(''),
  });

  protected entrar(): void {
    this.form.markAllAsTouched();

    this.loginService.logar(this.form.value).subscribe(dados => {
      dados ? alert('Login realizado com sucesso!') : alert('Login ou senha inválidos!');
    });
  }
}